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
 * 定时任务
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("sys_quartz_job")
@ApiModel(value = "SysQuartzJob对象", description = "定时任务")
public class SysQuartzJob implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "job_id", type = IdType.AUTO)
    private Long jobId;

    @ApiModelProperty("Spring Bean名称")
    private String beanName;

    @ApiModelProperty("cron 表达式")
    private String cronExpression;

    @ApiModelProperty("状态：1暂停、0启用")
    private Boolean isPause;

    @ApiModelProperty("任务名称")
    private String jobName;

    @ApiModelProperty("方法名称")
    private String methodName;

    @ApiModelProperty("参数")
    private String params;

    @ApiModelProperty("备注")
    private String description;

    @ApiModelProperty("负责人")
    private String personInCharge;

    @ApiModelProperty("报警邮箱")
    private String email;

    @ApiModelProperty("子任务ID")
    private String subTask;

    @ApiModelProperty("任务失败后是否暂停")
    private Boolean pauseAfterFailure;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
