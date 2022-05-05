package com.mall.third;

import com.mall.third.pojo.AlibabaOssProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author kylin
 */
@SpringBootApplication
public class ThirdPartyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ThirdPartyApplication.class, args);
        AlibabaOssProperties bean = run.getBean(AlibabaOssProperties.class);
        System.out.println("bean = " + bean);
    }

}
