package com.stu.app.controller;

import com.stu.app.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
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

        return "hello i am feign provider" + payment.toString();
    }

    @PostMapping("/upload")
    public String upload( @RequestParam  MultipartFile[] file) {
        Arrays.asList(file).forEach(file1 -> System.out.println(file1.getOriginalFilename()));
        return "666";
    }

}
