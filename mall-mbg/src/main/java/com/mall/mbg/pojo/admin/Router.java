package com.mall.mbg.pojo.admin;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author kylin
 */
@Data
public class Router {

    @ApiModelProperty("链接地址")
    private String path;

    @ApiModelProperty("组件")
    private String component;

    @ApiModelProperty("重定向")
    private String redirect;

    @ApiModelProperty
    private String name;

    @ApiModelProperty("菜单标题")
    private String title;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("子菜单")
    private List<Router> children;

}
