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
 * 部门
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("sys_dept")
@ApiModel(value = "SysDept对象", description = "部门")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "dept_id", type = IdType.AUTO)
    private Long deptId;

    @ApiModelProperty("上级部门")
    private Long pid;

    @ApiModelProperty("子部门数目")
    private Integer subCount;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("排序")
    private Integer deptSort;

    @ApiModelProperty("状态")
    private Boolean enabled;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
