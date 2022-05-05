package com.mall.admin.controller;

import com.mall.admin.service.FeignService;
import com.mall.mbg.pojo.product.PmsAttr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylin
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;



    @GetMapping(value = "/consumer/getPmsById/{id}")
    public ResponseEntity<PmsAttr> getPmsById(@PathVariable String id){
        return feignService.getPmsById(id);

    }





}
