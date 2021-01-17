package com.stu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Curiosity
 * @Date: 2021/1/16 22:03
 * @Description:
 */
@MapperScan(basePackages = "com.stu.app.dao")
@SpringBootApplication
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class, args);
    }
}
