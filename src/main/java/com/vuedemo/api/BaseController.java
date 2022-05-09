package com.vuedemo.api;

import com.vuedemo.core.model.LoginUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;

/**
 * Controller基类
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Slf4j
public class BaseController {

    /**
     * 获取当前登录用户
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    protected LoginUserInfo getLoginUser () {
        return (LoginUserInfo)SecurityUtils.getSubject().getPrincipal();
    }

}
