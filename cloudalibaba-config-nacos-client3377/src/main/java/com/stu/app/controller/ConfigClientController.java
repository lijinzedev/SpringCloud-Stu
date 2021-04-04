package com.stu.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Curiosity
 * @Date: 2021/1/17 17:51
 * @Description:
 */

@RestController
/**
 * SpringCloud 实现配置自动刷新
 */
@RefreshScope
public class ConfigClientController {
//    @Value("${config.info}")
//    private String configInfo;
//
//    @GetMapping("/config/info")
//    public String getConfigInfo() {
//        return configInfo;
//    }
}
