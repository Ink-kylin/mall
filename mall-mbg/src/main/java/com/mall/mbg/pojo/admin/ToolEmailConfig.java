package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 邮箱配置
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("tool_email_config")
@ApiModel(value = "ToolEmailConfig对象", description = "邮箱配置")
public class ToolEmailConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long configId;

    @ApiModelProperty("收件人")
    private String fromUser;

    @ApiModelProperty("邮件服务器SMTP地址")
    private String host;

    @ApiModelProperty("密码")
    private String pass;

    @ApiModelProperty("端口")
    private String port;

    @ApiModelProperty("发件者用户名")
    private String user;


}
