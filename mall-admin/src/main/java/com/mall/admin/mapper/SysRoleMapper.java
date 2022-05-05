package com.mall.admin.mapper;

import com.mall.mbg.pojo.admin.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mbg.pojo.admin.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectRolesByUser(SysUser user);
}
