package com.mall.product.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.mbg.pojo.product.PmsCategory;
import com.mall.product.mapper.PmsCategoryMapper;
import com.mall.product.service.IPmsCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory> implements IPmsCategoryService {

    @Autowired
    private PmsCategoryMapper categoryMapper;


    @Override
    public List<PmsCategory> getTree() {
        List<PmsCategory> pmsCategories = categoryMapper.selectList(null);
        return pmsCategories.stream().filter(p->p.getParentCid() == 0)
                .peek((category) -> category.setChildren(getChildren(category,pmsCategories)))
                .collect(Collectors.toList());
    }

    private List<PmsCategory> getChildren(PmsCategory current,List<PmsCategory> list){
        return list.stream().filter(p-> p.getParentCid().equals(current.getCatId()))
                .peek((category) -> category.setChildren(getChildren(category,list)))
                .collect(Collectors.toList());

    }

}
