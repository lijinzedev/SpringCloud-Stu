package com.creaway.service.impl;

import com.creaway.model.AppInfo;
import com.creaway.mapper.AppInfoDao;
import com.creaway.service.AppInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * app信息表 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class AppInfoServiceImpl extends ServiceImpl<AppInfoDao, AppInfo> implements AppInfoService {

}
