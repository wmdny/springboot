package com.vuedemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 启动类
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.vuedemo.dao")
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class);
        context.getEnvironment();
    }
}
