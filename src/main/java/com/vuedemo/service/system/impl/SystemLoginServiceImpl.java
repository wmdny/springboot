package com.vuedemo.service.system.impl;

import com.vuedemo.core.exception.BusinessException;
import com.vuedemo.core.model.LoginUserInfo;
import com.vuedemo.core.constants.ResponseStatus;
import com.vuedemo.core.utils.Utils;
import com.vuedemo.dao.system.dto.LoginDTO;
import com.vuedemo.dao.system.model.SystemLoginLog;
import com.vuedemo.service.common.CaptchaService;
import com.vuedemo.service.system.SystemLoginLogService;
import com.vuedemo.service.system.SystemLoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Slf4j
@Service
public class SystemLoginServiceImpl implements SystemLoginService {

    @Value("${project.version}")
    private String systemVersion;

    @Autowired
    private CaptchaService captchaService;

    @Autowired
    private SystemLoginLogService systemLoginLogService;

    @Override
    public String loginByPassword(LoginDTO dto, HttpServletRequest request) {
        SystemLoginLog loginLog = new SystemLoginLog();
        loginLog.setLoginUsername(dto.getUsername());
        loginLog.setLoginTime(new Date());
        loginLog.setSystemVersion(systemVersion);
        loginLog.setIp(Utils.User_Client.getIP(request));
        loginLog.setLocation(Utils.Location.getLocationString(loginLog.getIp()));
        loginLog.setPlatform(Utils.User_Client.getPlatform(request));
        loginLog.setClientInfo(Utils.User_Client.getBrowser(request));
        loginLog.setOsInfo(Utils.User_Client.getOS(request));
        loginLog.setServerIp(Utils.Server.getIP());
        // 校验验证码
        try {
            captchaService.check(dto.getUuid(), dto.getCode());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            loginLog.setReason(e.getMessage().length() > 200 ? (e.getMessage().substring(0, 190) + "...") : e.getMessage());
            loginLog.setSuccess(Boolean.FALSE);
            systemLoginLogService.create(loginLog);
            throw e;
        }
        // 校验用户名和密码
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(dto.getUsername(), dto.getPassword());
        try {
            subject.login(token);
            loginLog.setUserId(((LoginUserInfo)subject.getPrincipal()).getId());
            loginLog.setSuccess(Boolean.TRUE);
            systemLoginLogService.create(loginLog);
            return (String)subject.getSession().getId();
        } catch (AuthenticationException e) {
            log.error(ResponseStatus.ACCOUNT_INCORRECT.getMessage(), e);
            loginLog.setReason(e.getMessage().length() > 200 ? (e.getMessage().substring(0, 190) + "...") : e.getMessage());
            loginLog.setSuccess(Boolean.FALSE);
            systemLoginLogService.create(loginLog);
            throw new BusinessException(ResponseStatus.ACCOUNT_INCORRECT);
        }
    }
}
