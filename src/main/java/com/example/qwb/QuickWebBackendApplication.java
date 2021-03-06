package com.example.qwb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@MapperScan("com.example.qwb.dao")
@SpringBootApplication
public class QuickWebBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickWebBackendApplication.class, args);
    }

}
