package com.pgj.basicmodule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pgj.basicmodule.dao")
public class BasicmoduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicmoduleApplication.class, args);
    }

}
