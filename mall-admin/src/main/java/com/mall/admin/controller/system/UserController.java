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
import cn.hutool.core.text.StrBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.admin.service.ISysUserService;
import com.mall.mbg.pojo.admin.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
@Api(tags = "系统：用户管理")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    ISysUserService userService;

    @Autowired
    public UserController(ISysUserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/login")
    public ResponseEntity<Object> login(@RequestBody @Validated SysUser user, BindingResult result){
        if (result.hasFieldErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            StrBuilder builder = new StrBuilder();
            fieldErrors.forEach(
                    f->builder.append(f.getDefaultMessage())
            );
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(builder);
        }
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        SysUser sysUser = userService.getOne(wrapper);
        if (sysUser == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = "/info")
    public ResponseEntity<SysUser> info(){

        return ResponseEntity.ok().body(new SysUser());
    }

    @PostMapping(value = "/logout")
    public ResponseEntity<String> logout(){

        return ResponseEntity.ok("success");
    }

}
