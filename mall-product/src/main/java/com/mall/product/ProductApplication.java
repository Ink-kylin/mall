package com.mall.product;

import com.mall.product.config.PersonalInfoProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author kylin
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = {"com.mall.product.mapper"})
public class ProductApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ProductApplication.class, args);
        PersonalInfoProperties bean = run.getBean(PersonalInfoProperties.class);
        System.out.println("bean = " + bean);

    }
}
