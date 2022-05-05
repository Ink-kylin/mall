package com.mall.order.service.impl;

import com.mall.mbg.pojo.order.OmsOrderItem;
import com.mall.order.mapper.OmsOrderItemMapper;
import com.mall.order.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
