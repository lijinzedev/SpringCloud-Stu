package com.creaway.service.impl;

import com.creaway.model.Order;
import com.creaway.mapper.OrderDao;
import com.creaway.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 子订单表 服务实现类
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

}
