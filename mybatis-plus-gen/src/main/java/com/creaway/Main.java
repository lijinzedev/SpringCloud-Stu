package com.creaway;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Curiosity
 * @Date: 2021/1/17 23:12
 * @Description:
 */
@SpringBootApplication
@MapperScan(value = "com.creaway.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


}
