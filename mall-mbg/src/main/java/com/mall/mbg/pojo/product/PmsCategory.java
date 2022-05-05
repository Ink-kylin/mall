package com.mall.mbg.pojo.product;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.List;

import com.mall.mbg.validation.group.product.CategoryGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * 商品三级分类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("pms_category")
@ApiModel(value = "PmsCategory对象", description = "商品三级分类")
public class PmsCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分类id")
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Long catId;

    @ApiModelProperty("分类名称")
    @NotBlank(message = "分类名称{NotBlank}",groups = CategoryGroup.UpdateGroup.class)
    private String name;

    @ApiModelProperty("父分类id")
    private Long parentCid;

    @ApiModelProperty("层级")
    @NotNull(message = "层级不可为空")
    @Range(min=1, max=3,message = "层级必须在一到三级内")
    @NotBlank(message = "分类名称{NotBlank}",groups = CategoryGroup.CreateGroup.class)
    private Integer catLevel;

    @ApiModelProperty("是否显示[0-不显示，1显示]")
    @TableLogic(value = "1",delval = "0")
    private Integer showStatus;

    @ApiModelProperty("排序")
    @NotNull(message = "排序不可为空")
    @Min(value = 0,message = "排序最小值为{value}",groups = CategoryGroup.UpdateGroup.class)
    private Integer sort;

    @ApiModelProperty("图标地址")
    private String icon;

    @ApiModelProperty("计量单位")
    @Min(value = 0,message = "商品数量最小值为{value}",groups = CategoryGroup.UpdateGroup.class)
    private String productUnit;

    @ApiModelProperty("商品数量")
    private Integer productCount;

    @TableField(exist = false)
    private List<PmsCategory> children;

}
