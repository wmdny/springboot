package com.vuedemo.service.system;

import com.vuedemo.dao.system.dto.LoginDTO;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统登录
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemLoginService {

    /**
     * 密码登录
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    String loginByPassword (LoginDTO dto, HttpServletRequest request);
}
