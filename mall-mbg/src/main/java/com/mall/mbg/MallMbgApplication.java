package com.mall.mbg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MallMbgApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMbgApplication.class, args);
    }

}
