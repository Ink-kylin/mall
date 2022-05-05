package com.mall.product.service;

import com.alibaba.fastjson.JSONArray;
import com.mall.mbg.pojo.product.PmsCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
public interface IPmsCategoryService extends IService<PmsCategory> {

    List<PmsCategory> getTree();


}
