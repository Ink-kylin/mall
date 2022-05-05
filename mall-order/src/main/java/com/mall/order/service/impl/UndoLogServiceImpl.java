package com.mall.order.service.impl;

import com.mall.mbg.pojo.order.UndoLog;
import com.mall.order.mapper.UndoLogMapper;
import com.mall.order.service.IUndoLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class UndoLogServiceImpl extends ServiceImpl<UndoLogMapper, UndoLog> implements IUndoLogService {

}
