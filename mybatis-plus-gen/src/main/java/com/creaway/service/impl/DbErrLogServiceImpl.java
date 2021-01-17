package com.creaway.service.impl;

import com.creaway.model.DbErrLog;
import com.creaway.mapper.DbErrLogDao;
import com.creaway.service.DbErrLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 记录数据库存储过程执行情况 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class DbErrLogServiceImpl extends ServiceImpl<DbErrLogDao, DbErrLog> implements DbErrLogService {

}
