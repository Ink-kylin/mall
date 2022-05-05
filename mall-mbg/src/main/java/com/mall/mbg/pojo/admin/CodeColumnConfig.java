package com.mall.mbg.pojo.admin;

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
 * 代码生成字段信息存储
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("code_column_config")
@ApiModel(value = "CodeColumnConfig对象", description = "代码生成字段信息存储")
public class CodeColumnConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "column_id", type = IdType.AUTO)
    private Long columnId;

    private String tableName;

    private String columnName;

    private String columnType;

    private String dictName;

    private String extra;

    private Boolean formShow;

    private String formType;

    private String keyType;

    private Boolean listShow;

    private Boolean notNull;

    private String queryType;

    private String remark;

    private String dateAnnotation;


}
