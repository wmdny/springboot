package com.vuedemo.core.exception;

/**
 * 不安全的会话异常
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public class UnSafeSessionException extends RuntimeException {

    public UnSafeSessionException () {
        super("不安全的会话");
    }
}
