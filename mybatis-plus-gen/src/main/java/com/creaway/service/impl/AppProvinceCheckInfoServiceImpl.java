package com.creaway.service.impl;

import com.creaway.model.AppProvinceCheckInfo;
import com.creaway.mapper.AppProvinceCheckInfoDao;
import com.creaway.service.AppProvinceCheckInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定制型需求省侧平台检测资料信息表（包括检测报告、app文件），只存检测通过的。 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class AppProvinceCheckInfoServiceImpl extends ServiceImpl<AppProvinceCheckInfoDao, AppProvinceCheckInfo> implements AppProvinceCheckInfoService {

}
