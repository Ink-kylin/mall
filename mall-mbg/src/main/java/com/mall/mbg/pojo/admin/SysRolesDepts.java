package com.mall.mbg.pojo.admin;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色部门关联
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Getter
@Setter
@TableName("sys_roles_depts")
@ApiModel(value = "SysRolesDepts对象", description = "角色部门关联")
public class SysRolesDepts implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long roleId;

    private Long deptId;


}
