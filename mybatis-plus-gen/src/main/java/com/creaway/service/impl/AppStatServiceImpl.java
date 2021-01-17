package com.creaway.service.impl;

import com.creaway.model.AppStat;
import com.creaway.mapper.AppStatDao;
import com.creaway.service.AppStatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 检测统计表 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class AppStatServiceImpl extends ServiceImpl<AppStatDao, AppStat> implements AppStatService {

}
