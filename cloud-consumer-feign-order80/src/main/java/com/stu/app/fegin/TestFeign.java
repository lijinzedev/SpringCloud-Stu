package com.stu.app.fegin;

import com.stu.app.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: Curiosity
 * @Date: 2021/1/23 17:46
 * @Description:
 */
@FeignClient(name = "nacos-order-consumer", path = "/feign")
public interface TestFeign {
    @PostMapping("/get")
    public String providerFeign(@RequestBody Payment payment);
}
