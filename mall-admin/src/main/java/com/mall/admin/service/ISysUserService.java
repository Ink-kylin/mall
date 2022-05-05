package com.mall.admin.service;

import com.mall.mbg.pojo.admin.SysMenu;
import com.mall.mbg.pojo.admin.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
public interface ISysUserService extends IService<SysUser> {

    List<SysMenu> getRouters(Long userId);

}
