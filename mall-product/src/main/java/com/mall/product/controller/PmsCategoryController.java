package com.mall.product.controller;

import cn.hutool.core.text.StrBuilder;
import com.mall.common.utils.R;
import com.mall.mbg.pojo.product.PmsCategory;
import com.mall.mbg.validation.group.product.CategoryGroup;
import com.mall.product.service.IPmsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@RestController
@RequestMapping("/category")
public class PmsCategoryController {

    private final IPmsCategoryService categoryService;

    @Autowired
    public PmsCategoryController(IPmsCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/getNode/{catId}")
    public R getNode(@PathVariable(value = "catId") Long catId){
        return R.ok().put("data",categoryService.getById(catId));
    }


    @GetMapping(value = "/getTree")
    public R getTree(){
        return R.ok().put("list",categoryService.getTree());
    }

    /**
     * @Description 添加单个分类
     * @author albert
     *
     */
    @PostMapping(value = "/appendNode")
    public ResponseEntity<String> appendNode(@RequestBody @Validated PmsCategory category, BindingResult result){
        if (result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            StrBuilder builder = new StrBuilder();
            fieldErrors.forEach(p-> builder.append(p.getDefaultMessage()));
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(builder.toString());
        }
        categoryService.save(category);
        return ResponseEntity.ok().body(null);

    }

    @PutMapping(value = "/updateNode")
    public R updateNode(@RequestBody @Validated(value = CategoryGroup.UpdateGroup.class) PmsCategory category){
       categoryService.updateById(category);
        return R.ok();
    }

    /**
     * @Description 批量删除分类
     * @author albert
     *
     */
    @DeleteMapping(value = "/DeleteBatchNodes")
    public  R DeleteBatchNodes(@RequestBody List<Long> json){
        categoryService.removeBatchByIds(json);
        return R.ok();
    }

}
