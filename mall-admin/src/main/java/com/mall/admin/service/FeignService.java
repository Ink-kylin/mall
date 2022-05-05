package com.mall.admin.service;

import com.mall.mbg.pojo.product.PmsAttr;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author kylin
 */
@FeignClient(value = "mall-product")
public interface FeignService {

    @GetMapping(value = "/pmsAttr/getPmsById/{id}")
    ResponseEntity<PmsAttr> getPmsById(@PathVariable String id);

}
