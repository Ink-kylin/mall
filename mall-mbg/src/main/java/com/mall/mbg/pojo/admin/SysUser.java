package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.mall.mbg.validation.group.admin.UserGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("sys_user")
@ApiModel(value = "SysUser对象", description = "系统用户")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty("部门名称")
    private Long deptId;

    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名{NotBlank}",groups = {UserGroup.CreateGroup.class})
    private String username;

    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("性别")
    private String gender;

    @ApiModelProperty("手机号码")
    private String phone;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("头像地址")
    private String avatarName;

    @ApiModelProperty("头像真实路径")
    private String avatarPath;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码{NotBlank}",groups = {UserGroup.CreateGroup.class})
    private String password;

    @ApiModelProperty("是否为admin账号")
    private Boolean isAdmin;

    @ApiModelProperty("状态：1启用、0禁用")
    private Long enabled;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("修改密码的时间")
    private LocalDateTime pwdResetTime;

    @ApiModelProperty("创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;


}
