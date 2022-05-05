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
 * 数据库管理
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("mnt_database")
@ApiModel(value = "MntDatabase对象", description = "数据库管理")
public class MntDatabase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private String dbId;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("jdbc连接")
    private String jdbcUrl;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty("密码")
    private String pwd;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
