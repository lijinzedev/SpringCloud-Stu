package com.creaway.service.impl;

import com.creaway.model.LoginLog;
import com.creaway.mapper.LoginLogDao;
import com.creaway.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登陆日志 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogDao, LoginLog> implements LoginLogService {

}
