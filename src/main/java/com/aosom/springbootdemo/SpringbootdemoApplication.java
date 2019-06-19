package com.aosom.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
        System.out.println("------测试自动化部署main。。。。。。。ffffdfsdfsd。。hello world。。。。");
    }

}
