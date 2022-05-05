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
 * 应用管理
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("mnt_app")
@ApiModel(value = "MntApp对象", description = "应用管理")
public class MntApp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "app_id", type = IdType.AUTO)
    private Long appId;

    @ApiModelProperty("应用名称")
    private String name;

    @ApiModelProperty("上传目录")
    private String uploadPath;

    @ApiModelProperty("部署路径")
    private String deployPath;

    @ApiModelProperty("备份路径")
    private String backupPath;

    @ApiModelProperty("应用端口")
    private Integer port;

    @ApiModelProperty("启动脚本")
    private String startScript;

    @ApiModelProperty("部署脚本")
    private String deployScript;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
