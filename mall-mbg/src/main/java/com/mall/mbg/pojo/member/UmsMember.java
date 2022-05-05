package com.mall.mbg.pojo.member;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 会员
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("ums_member")
@ApiModel(value = "UmsMember对象", description = "会员")
public class UmsMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("社交平台uid")
    private String socialUid;

    @ApiModelProperty("社交平台给的访问令牌")
    private String accessToken;

    @ApiModelProperty("当次令牌的过期时间，单位s")
    private Integer expireIn;

    @ApiModelProperty("注册类型[0-本平台，1-微博，2-微信]")
    private Integer registerType;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("会员等级id")
    private Long levelId;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("手机号码")
    private String mobile;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("头像")
    private String header;

    @ApiModelProperty("性别[1-男，0-女]")
    private Integer gender;

    @ApiModelProperty("生日")
    private LocalDate birth;

    @ApiModelProperty("所在城市")
    private String city;

    @ApiModelProperty("职业")
    private String job;

    @ApiModelProperty("个性签名")
    private String sign;

    @ApiModelProperty("用户来源")
    private Integer sourceType;

    @ApiModelProperty("积分")
    private Integer integration;

    @ApiModelProperty("成长值")
    private Integer growth;

    @ApiModelProperty("启用状态[0启用，1-禁用]")
    private Integer status;

    @ApiModelProperty("注册时间")
    private LocalDateTime createTime;


}
