package com.vuedemo.core.servlet;

import lombok.Getter;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;

/**
 * 增加请求流副本
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Getter
public class ServletDuplicateRequestWrapper extends HttpServletRequestWrapper {

    private ServletDuplicateInputStream servletDuplicateInputStream;

    public ServletDuplicateRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

    @Override
    public ServletInputStream getInputStream() throws IOException{
        if (servletDuplicateInputStream == null) {
            servletDuplicateInputStream = new ServletDuplicateInputStream(super.getInputStream());
        }
        return servletDuplicateInputStream;
    }

}
