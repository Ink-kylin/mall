package com.mall.product.service.impl;


import com.mall.mbg.pojo.product.PmsBrand;
import com.mall.product.mapper.PmsBrandMapper;
import com.mall.product.service.IPmsBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements IPmsBrandService {

    private PmsBrandMapper brandMapper;


    @Autowired
    public PmsBrandServiceImpl(PmsBrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

}
