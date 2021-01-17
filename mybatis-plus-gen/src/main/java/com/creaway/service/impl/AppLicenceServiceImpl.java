package com.creaway.service.impl;

import com.creaway.model.AppLicence;
import com.creaway.mapper.AppLicenceDao;
import com.creaway.service.AppLicenceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * app每次安装使用的许可编号 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class AppLicenceServiceImpl extends ServiceImpl<AppLicenceDao, AppLicence> implements AppLicenceService {

}
