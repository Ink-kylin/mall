package com.mall.admin.service.impl;

import com.mall.mbg.pojo.admin.SysQuartzJob;
import com.mall.admin.mapper.SysQuartzJobMapper;
import com.mall.admin.service.ISysQuartzJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务 服务实现类
 * </p>
 *
 * @author kylin
 * @since 2022-04-07
 */
@Service
public class SysQuartzJobServiceImpl extends ServiceImpl<SysQuartzJobMapper, SysQuartzJob> implements ISysQuartzJobService {

}
