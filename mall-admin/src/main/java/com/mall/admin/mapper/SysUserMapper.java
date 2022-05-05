package com.mall.admin.mapper;

import com.mall.mbg.pojo.admin.SysMenu;
import com.mall.mbg.pojo.admin.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
