package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 支付宝配置类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("tool_alipay_config")
@ApiModel(value = "ToolAlipayConfig对象", description = "支付宝配置类")
public class ToolAlipayConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long configId;

    @ApiModelProperty("应用ID")
    private String appId;

    @ApiModelProperty("编码")
    private String charset;

    @ApiModelProperty("类型 固定格式json")
    private String format;

    @ApiModelProperty("网关地址")
    private String gatewayUrl;

    @ApiModelProperty("异步回调")
    private String notifyUrl;

    @ApiModelProperty("私钥")
    private String privateKey;

    @ApiModelProperty("公钥")
    private String publicKey;

    @ApiModelProperty("回调地址")
    private String returnUrl;

    @ApiModelProperty("签名方式")
    private String signType;

    @ApiModelProperty("商户号")
    private String sysServiceProviderId;


}
