package com.liudegui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.liudegui.*")
@SpringBootApplication
public class JxauCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxauCommunityApplication.class, args);
    }
}
