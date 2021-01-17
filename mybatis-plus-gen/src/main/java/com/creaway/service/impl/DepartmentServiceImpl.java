package com.creaway.service.impl;

import com.creaway.model.Department;
import com.creaway.mapper.DepartmentDao;
import com.creaway.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门信息表 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentDao, Department> implements DepartmentService {

}
