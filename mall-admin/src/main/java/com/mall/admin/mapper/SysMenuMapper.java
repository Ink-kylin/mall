package com.mall.admin.mapper;

import com.mall.mbg.pojo.admin.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mbg.pojo.admin.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 系统菜单 Mapper 接口
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> getRouters(Long userId);
}
