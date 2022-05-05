package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 应用与服务器关联
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("mnt_deploy_server")
@ApiModel(value = "MntDeployServer对象", description = "应用与服务器关联")
public class MntDeployServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("部署ID")
    private Long deployId;

    @ApiModelProperty("服务ID")
    private Long serverId;


}
