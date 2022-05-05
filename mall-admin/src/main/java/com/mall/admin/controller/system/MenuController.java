/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.mall.admin.controller.system;

import cn.hutool.core.collection.CollectionUtil;
import com.mall.admin.service.ISysRoleService;
import com.mall.admin.service.ISysUserService;
import com.mall.mbg.pojo.admin.SysMenu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Zheng Jie
 * @date 2018-12-03
 */

@RestController
@RequiredArgsConstructor
@Api(tags = "系统：菜单管理")
@RequestMapping("/api/menus")
public class MenuController {

    private ISysUserService userService;

    private ISysRoleService roleService;

    @Autowired
    public MenuController(ISysUserService userService) {
        this.userService = userService;
    }

    /**
     * @Description 查询用户的角色所拥有的路由菜单
     * @author albert
     *
     */
    @GetMapping(value = "/routers/{userId}")
    public ResponseEntity<List<SysMenu>> router(@PathVariable(value = "userId") Long userId){
        List<SysMenu> routers = userService.getRouters(userId);
        return ResponseEntity.ok().body(routers);
    }
}
