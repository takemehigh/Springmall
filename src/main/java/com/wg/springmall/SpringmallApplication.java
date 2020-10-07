package com.wg.springmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wg.springmall.dao.**"})
public class SpringmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringmallApplication.class);
    }
}
