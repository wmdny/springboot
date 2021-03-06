package com.vuedemo.core.servlet;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import java.io.*;
import java.nio.charset.Charset;

/**
 * 包含副本的输入流
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public class ServletDuplicateInputStream extends ServletInputStream {

    private ServletInputStream stream;

    private ByteArrayInputStream duplicate;

    private String body;

    public ServletDuplicateInputStream (ServletInputStream servletInputStream) {
        this.stream = servletInputStream;
        this.body = this.getBodyString();
        this.duplicate = new ByteArrayInputStream(body.getBytes(Charset.forName("UTF-8")));
    }

    @Override
    public int read() {
        return duplicate.read();
    }

    @Override
    public boolean isFinished() {
        return stream.isFinished();
    }

    @Override
    public boolean isReady() {
        return stream.isReady();
    }

    @Override
    public void setReadListener(ReadListener readListener) {
        stream.setReadListener(readListener);
    }

    /**
     * 获取请求体参数字符串
     */
    private String getBodyString() {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = cloneInputStream(this.stream);
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /**
     * 复制输入流
     */
    private InputStream cloneInputStream(ServletInputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buffer)) > -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    /**
     * 获取请求体内容
     */
    public String getBody () {
        return body;
    }
}
