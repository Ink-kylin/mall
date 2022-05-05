package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 部署历史管理
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("mnt_deploy_history")
@ApiModel(value = "MntDeployHistory对象", description = "部署历史管理")
public class MntDeployHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private String historyId;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("部署日期")
    private LocalDateTime deployDate;

    @ApiModelProperty("部署用户")
    private String deployUser;

    @ApiModelProperty("服务器IP")
    private String ip;

    @ApiModelProperty("部署编号")
    private Long deployId;


}
