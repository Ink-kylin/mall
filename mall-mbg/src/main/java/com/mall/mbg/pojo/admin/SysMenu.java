package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 系统菜单
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("sys_menu")
@ApiModel(value = "SysMenu对象", description = "系统菜单")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    @ApiModelProperty("上级菜单ID")
    private Long pid;

    @ApiModelProperty("子菜单数目")
    private Integer subCount;

    @ApiModelProperty("菜单类型")
    private Integer type;

    @ApiModelProperty("菜单标题")
    private String title;

    @ApiModelProperty("组件名称")
    private String name;

    @ApiModelProperty("组件")
    private String component;

    @ApiModelProperty("排序")
    private Integer menuSort;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("链接地址")
    private String path;

    @ApiModelProperty("是否外链")
    private Boolean iFrame;

    @ApiModelProperty("缓存")
    private Boolean cache;

    @ApiModelProperty("隐藏")
    private Boolean hidden;

    @ApiModelProperty("权限")
    private String permission;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @TableField(exist = false)
    private List<SysMenu> children;

}
