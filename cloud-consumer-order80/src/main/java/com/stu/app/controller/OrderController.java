package com.stu.app.controller;


import cn.hutool.core.io.LineHandler;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.lang.func.VoidFunc0;
import com.stu.app.entities.CommonResult;
import com.stu.app.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.function.Consumer;

/**
 * @author: Curiosity
 * @Date: 2021/1/16 23:53
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){

        OrderController controller=new OrderController();
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);  //写操作
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    public void test(String a){

    }
}
