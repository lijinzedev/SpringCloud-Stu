package com.creaway.service.impl;

import com.creaway.model.Code;
import com.creaway.mapper.CodeDao;
import com.creaway.service.CodeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据字典表：存储代码具体值 。 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class CodeServiceImpl extends ServiceImpl<CodeDao, Code> implements CodeService {

}
