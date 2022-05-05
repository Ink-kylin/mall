package com.mall.product.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.mbg.pojo.product.PmsAttr;
import com.mall.product.service.IPmsAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品属性 前端控制器
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@RestController
@RequestMapping("/pmsAttr")
public class PmsAttrController {

    @Autowired
    private IPmsAttrService pmsAttrService;

    @GetMapping(value = "/getPmsById/{id}")
    public ResponseEntity<PmsAttr> getPmsById(@PathVariable Long id){
        QueryWrapper<PmsAttr> wrapper = new QueryWrapper<>();
        wrapper.eq("attr_id",id);
        PmsAttr one = pmsAttrService.getOne(wrapper);
        return new ResponseEntity<>(one, HttpStatus.OK);
    }

}
