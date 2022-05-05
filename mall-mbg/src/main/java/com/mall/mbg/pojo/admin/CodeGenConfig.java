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
 * 代码生成器配置
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("code_gen_config")
@ApiModel(value = "CodeGenConfig对象", description = "代码生成器配置")
public class CodeGenConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "config_id", type = IdType.AUTO)
    private Long configId;

    @ApiModelProperty("表名")
    private String tableName;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("是否覆盖")
    private Boolean cover;

    @ApiModelProperty("模块名称")
    private String moduleName;

    @ApiModelProperty("至于哪个包下")
    private String pack;

    @ApiModelProperty("前端代码生成的路径")
    private String path;

    @ApiModelProperty("前端Api文件路径")
    private String apiPath;

    @ApiModelProperty("表前缀")
    private String prefix;

    @ApiModelProperty("接口名称")
    private String apiAlias;


}
