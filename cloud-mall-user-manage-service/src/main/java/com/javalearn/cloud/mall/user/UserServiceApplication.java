package com.javalearn.cloud.mall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author king-pan
 * @date 2019/11/18 0:40
 */
@SpringBootApplication
@MapperScan(basePackages = "com.javalearn.cloud.mall.user.mapper")
@ComponentScan(basePackages = "com.javalearn.cloud.mall")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
