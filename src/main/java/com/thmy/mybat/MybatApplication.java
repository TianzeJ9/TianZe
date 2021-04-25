package com.thmy.mybat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.thmy.mybat.mapper")
public class MybatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatApplication.class, args);
    }

}
