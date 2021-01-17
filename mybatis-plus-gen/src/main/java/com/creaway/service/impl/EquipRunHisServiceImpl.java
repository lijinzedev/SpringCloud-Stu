package com.creaway.service.impl;

import com.creaway.model.EquipRunHis;
import com.creaway.mapper.EquipRunHisDao;
import com.creaway.service.EquipRunHisService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 记录app的历史安装情况,不含最新一次安装卸载记录 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class EquipRunHisServiceImpl extends ServiceImpl<EquipRunHisDao, EquipRunHis> implements EquipRunHisService {

}
