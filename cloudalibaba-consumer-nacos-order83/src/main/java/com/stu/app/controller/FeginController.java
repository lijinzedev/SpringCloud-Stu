package com.stu.app.controller;

import com.stu.app.entities.Payment;
import io.micrometer.core.instrument.util.TimeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @author: Curiosity
 * @Date: 2021/1/23 17:42
 * @Description: feigin的提供者
 */
@RestController
@RequestMapping("/feign")
public class FeginController {

    @PostMapping("/get")
    public String providerFeign(@RequestBody Payment payment) {
        return "hello i am nacos order feign provider"+payment.toString();
    }


}
