package com.creaway.service.impl;

import com.creaway.model.RolePermitRela;
import com.creaway.mapper.RolePermitRelaDao;
import com.creaway.service.RolePermitRelaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和功能点关系，功能点指该角色对其拥有菜单的操作能力 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class RolePermitRelaServiceImpl extends ServiceImpl<RolePermitRelaDao, RolePermitRela> implements RolePermitRelaService {

}
