package com.mall.mbg.pojo.ware;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购信息
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("wms_purchase")
@ApiModel(value = "WmsPurchase对象", description = "采购信息")
public class WmsPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long assigneeId;

    private String assigneeName;

    private String phone;

    private Integer priority;

    private Integer status;

    private Long wareId;

    private BigDecimal amount;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
