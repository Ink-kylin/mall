package com.mall.mbg.pojo.product;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * spu信息介绍
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("pms_spu_info_desc")
@ApiModel(value = "PmsSpuInfoDesc对象", description = "spu信息介绍")
public class PmsSpuInfoDesc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品id")
    private Long spuId;

    @ApiModelProperty("商品介绍")
    private String descript;


}
