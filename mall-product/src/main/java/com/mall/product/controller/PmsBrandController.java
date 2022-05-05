package com.mall.product.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.mall.common.utils.R;
import com.mall.mbg.pojo.product.PmsBrand;
import com.mall.product.service.IPmsBrandService;
import com.mall.product.service.impl.PmsBrandServiceImpl;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.interfaces.PBEKey;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 品牌 前端控制器
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@RestController
@RequestMapping("/brand")
public class PmsBrandController {

    private final IPmsBrandService brandService;

    //framework manages object lifecycle
    @Autowired
    public PmsBrandController(PmsBrandServiceImpl brandService) {
        this.brandService = brandService;
    }

    @GetMapping(value = "/getSingle/{brandId}")
    public R getSingle(@PathVariable(value = "brandId") Long brandId){
        QueryWrapper<PmsBrand> wrapper = new QueryWrapper<>();
        wrapper.eq("brand_id",brandId);
        return R.ok().put("data",brandService.getOne(wrapper));
    }

    @GetMapping(value = "/getList")
    public R getList(@RequestParam(value = "page",defaultValue = "1")Integer pageIndex,@RequestParam(value = "limit",defaultValue = "10") Integer pageSize){
        Page<PmsBrand> page = brandService.page(new Page<>());
        page.setCurrent(pageIndex);
        page.setSize(pageSize);
        page.setTotal((long) pageIndex * pageSize);
        return R.ok().put("data",page);
    }

    @PostMapping(value = "/createHandle")
    public R createNode(@RequestBody PmsBrand brand){
        brandService.save(brand);
        return R.ok();
    }

    @PutMapping(value = "/updateHandle")
    public R updateHandle(@RequestBody PmsBrand brand){
        brandService.updateById(brand);
        return R.ok();
    }

    @DeleteMapping(value = "/deleteHandle")
    public R deleteHandle(@RequestBody List<Long> json){
        brandService.removeBatchByIds(json);
        return R.ok();
    }


}
