package com.creaway.service.impl;

import com.creaway.model.Org;
import com.creaway.mapper.OrgDao;
import com.creaway.service.OrgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单位信息表 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class OrgServiceImpl extends ServiceImpl<OrgDao, Org> implements OrgService {

}
