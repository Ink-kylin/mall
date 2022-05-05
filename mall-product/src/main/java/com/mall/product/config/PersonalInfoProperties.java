package com.mall.product.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author kylin
 */
@ConfigurationProperties(value = "albert")
@Component
@Data
@ToString
public class PersonalInfoProperties {

    private String username;

    private Integer age;
}
