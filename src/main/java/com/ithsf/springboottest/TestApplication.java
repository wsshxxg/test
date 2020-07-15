package com.ithsf.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ithsf.springboottest.dao")
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class);
    }
}
