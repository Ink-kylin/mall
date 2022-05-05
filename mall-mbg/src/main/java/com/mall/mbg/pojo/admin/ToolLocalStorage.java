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
 * 本地存储
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("tool_local_storage")
@ApiModel(value = "ToolLocalStorage对象", description = "本地存储")
public class ToolLocalStorage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "storage_id", type = IdType.AUTO)
    private Long storageId;

    @ApiModelProperty("文件真实的名称")
    private String realName;

    @ApiModelProperty("文件名")
    private String name;

    @ApiModelProperty("后缀")
    private String suffix;

    @ApiModelProperty("路径")
    private String path;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("大小")
    private String size;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
