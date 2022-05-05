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
 * 七牛云文件存储
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("tool_qiniu_content")
@ApiModel(value = "ToolQiniuContent对象", description = "七牛云文件存储")
public class ToolQiniuContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "content_id", type = IdType.AUTO)
    private Long contentId;

    @ApiModelProperty("Bucket 识别符")
    private String bucket;

    @ApiModelProperty("文件名称")
    private String name;

    @ApiModelProperty("文件大小")
    private String size;

    @ApiModelProperty("文件类型：私有或公开")
    private String type;

    @ApiModelProperty("文件url")
    private String url;

    @ApiModelProperty("文件后缀")
    private String suffix;

    @ApiModelProperty("上传或同步的时间")
    private LocalDateTime updateTime;


}
