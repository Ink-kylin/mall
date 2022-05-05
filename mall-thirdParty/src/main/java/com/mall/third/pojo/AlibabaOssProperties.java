package com.mall.third.pojo;

import com.alibaba.cloud.spring.boot.oss.env.OssProperties;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kylin
 */
@ConfigurationProperties(prefix = "alibaba.cloud")
@Component
@Data
@ToString
public class AlibabaOssProperties {

    private String accesskey;

    private String secretkey;

    private String bucket;

    private OssProperties oss;

}
