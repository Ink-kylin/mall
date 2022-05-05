package com.mall.admin.service.impl;

import com.mall.admin.mapper.*;
import com.mall.mbg.pojo.admin.*;
import com.mall.admin.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    private SysUserMapper userMapper;

    private SysUsersRolesMapper usersRolesMapper;

    private SysRoleMapper roleMapper;

    private SysRolesMenusMapper rolesMenusMapper;

    private SysMenuMapper menuMapper;


    @Autowired
    public SysUserServiceImpl(SysUserMapper userMapper, SysUsersRolesMapper usersRolesMapper, SysRoleMapper roleMapper, SysRolesMenusMapper rolesMenusMapper, SysMenuMapper menuMapper) {
        this.userMapper = userMapper;
        this.usersRolesMapper = usersRolesMapper;
        this.roleMapper = roleMapper;
        this.rolesMenusMapper = rolesMenusMapper;
        this.menuMapper = menuMapper;
    }

    @Override
    public List<SysMenu> getRouters(Long userId) {
        List<SysMenu> routers = menuMapper.getRouters(userId);
        return routers.stream().filter(f->f.getPid() == null)
                .peek((c) -> c.setChildren(getChildren(c,routers)))
                .collect(Collectors.toList());
    }

    private List<SysMenu> getChildren(SysMenu current, List<SysMenu> list){
        return list.stream().filter(p-> !Objects.isNull(p.getPid()) && p.getPid().equals(current.getMenuId()))
                .peek((c) -> c.setChildren(getChildren(c,list)))
                .collect(Collectors.toList());

    }
    
}
