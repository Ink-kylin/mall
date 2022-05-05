package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 七牛云配置
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("tool_qiniu_config")
@ApiModel(value = "ToolQiniuConfig对象", description = "七牛云配置")
public class ToolQiniuConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long configId;

    @ApiModelProperty("accessKey")
    private String accessKey;

    @ApiModelProperty("Bucket 识别符")
    private String bucket;

    @ApiModelProperty("外链域名")
    private String host;

    @ApiModelProperty("secretKey")
    private String secretKey;

    @ApiModelProperty("空间类型")
    private String type;

    @ApiModelProperty("机房")
    private String zone;


}
