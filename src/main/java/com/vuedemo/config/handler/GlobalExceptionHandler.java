package com.vuedemo.config.handler;

import com.vuedemo.core.exception.BusinessException;
import com.vuedemo.core.model.ApiResponse;
import com.vuedemo.core.constants.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

/**
 * 全局异常处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 业务异常处理
     */
    @ExceptionHandler(BusinessException.class)
    public <T> ApiResponse<T> handleBusinessException (BusinessException e) {
        log.error(e.getMessage(), e);
        return ApiResponse.failed(e.getCode(), e.getMessage());
    }

    /**
     * 无权限异常处理
     */
    @ExceptionHandler(UnauthorizedException.class)
    public <T> ApiResponse<T> handleUnauthorizedException (UnauthorizedException e) {
        log.error(e.getMessage(), e);
        return ApiResponse.failed("没有操作权限");
    }

    /**
     * 参数验证未通过异常处理
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public <T> ApiResponse<T> handleMethodArgumentNotValidException (MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);
        BindingResult bindingResult = e.getBindingResult();
        List<String> errors = new ArrayList<>();
        for(FieldError fieldError : bindingResult.getFieldErrors()){
            errors.add(fieldError.getDefaultMessage());
        }
        return ApiResponse.failed(ResponseStatus.BAD_REQUEST.getCode(), StringUtils.join(errors));
    }

    /**
     * 其它异常处理
     */
    @ExceptionHandler(Exception.class)
    public <T> ApiResponse<T> handleException (Exception e) {
        log.error(e.getMessage(), e);
        return ApiResponse.failed(ResponseStatus.SERVER_ERROR, e);
    }
}
