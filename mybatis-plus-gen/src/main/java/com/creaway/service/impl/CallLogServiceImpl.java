package com.creaway.service.impl;

import com.creaway.model.CallLog;
import com.creaway.mapper.CallLogDao;
import com.creaway.service.CallLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 调用接口日志 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class CallLogServiceImpl extends ServiceImpl<CallLogDao, CallLog> implements CallLogService {

}
