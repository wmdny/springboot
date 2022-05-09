package com.vuedemo.core.servlet;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * 增加响应流副本
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public class ServletDuplicateResponseWrapper extends HttpServletResponseWrapper {

    private ServletDuplicateOutputStream servletDuplicateOutputStream;

    public ServletDuplicateResponseWrapper(HttpServletResponse httpServletResponse) {
        super(httpServletResponse);
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if (servletDuplicateOutputStream == null) {
            servletDuplicateOutputStream = new ServletDuplicateOutputStream(super.getOutputStream());
        }
        return servletDuplicateOutputStream;
    }
}
