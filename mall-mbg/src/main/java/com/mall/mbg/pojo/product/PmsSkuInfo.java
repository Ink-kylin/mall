package com.mall.mbg.pojo.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * sku信息
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("pms_sku_info")
@ApiModel(value = "PmsSkuInfo对象", description = "sku信息")
public class PmsSkuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("skuId")
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Long skuId;

    @ApiModelProperty("spuId")
    private Long spuId;

    @ApiModelProperty("sku名称")
    private String skuName;

    @ApiModelProperty("sku介绍描述")
    private String skuDesc;

    @ApiModelProperty("所属分类id")
    private Long catelogId;

    @ApiModelProperty("品牌id")
    private Long brandId;

    @ApiModelProperty("默认图片")
    private String skuDefaultImg;

    @ApiModelProperty("标题")
    private String skuTitle;

    @ApiModelProperty("副标题")
    private String skuSubtitle;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("销量")
    private Long saleCount;


}
