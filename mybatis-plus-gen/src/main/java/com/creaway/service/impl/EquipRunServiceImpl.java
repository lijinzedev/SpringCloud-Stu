package com.creaway.service.impl;

import com.creaway.model.EquipRun;
import com.creaway.mapper.EquipRunDao;
import com.creaway.service.EquipRunService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 设备app运行表,记录最近一次安装卸载情况 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class EquipRunServiceImpl extends ServiceImpl<EquipRunDao, EquipRun> implements EquipRunService {

}
