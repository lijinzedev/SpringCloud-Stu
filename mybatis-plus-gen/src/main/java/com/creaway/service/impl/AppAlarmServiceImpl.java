package com.creaway.service.impl;

import com.creaway.model.AppAlarm;
import com.creaway.mapper.AppAlarmDao;
import com.creaway.service.AppAlarmService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * app预警信息表 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class AppAlarmServiceImpl extends ServiceImpl<AppAlarmDao, AppAlarm> implements AppAlarmService {

}
