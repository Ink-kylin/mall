package com.mall.mbg.pojo.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 品牌分类关联
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("pms_category_brand_relation")
@ApiModel(value = "PmsCategoryBrandRelation对象", description = "品牌分类关联")
public class PmsCategoryBrandRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("品牌id")
    private Long brandId;

    @ApiModelProperty("分类id")
    private Long catelogId;

    private String brandName;

    private String catelogName;


}
