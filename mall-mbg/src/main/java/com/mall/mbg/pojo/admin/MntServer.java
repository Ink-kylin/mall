package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 服务器管理
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("mnt_server")
@ApiModel(value = "MntServer对象", description = "服务器管理")
public class MntServer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "server_id", type = IdType.AUTO)
    private Long serverId;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("IP地址")
    private String ip;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("端口")
    private Integer port;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
