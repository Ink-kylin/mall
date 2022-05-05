package com.mall.order.service.impl;

import com.mall.mbg.pojo.order.OmsOrder;
import com.mall.order.mapper.OmsOrderMapper;
import com.mall.order.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
