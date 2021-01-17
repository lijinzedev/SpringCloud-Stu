package com.creaway.service.impl;

import com.creaway.model.AppUsageD;
import com.creaway.mapper.AppUsageDDao;
import com.creaway.service.AppUsageDService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 每个设备的app统计情况表，按日统计 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class AppUsageDServiceImpl extends ServiceImpl<AppUsageDDao, AppUsageD> implements AppUsageDService {

}
