package com.creaway.controller;


import com.creaway.model.AppAlarm;
import com.creaway.service.AppAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * <p>
 * app预警信息表 前端控制器
 * </p>
 *
 * @author lijinze
 * @since 2021-01-17
 */
@RestController
@RequestMapping("/appAlarm")
public class AppAlarmController {
    @Autowired
    AppAlarmService appAlarmService;

    @GetMapping("/")
    public void getall() {
        //        Main.autoGenerator().execute();
        AppAlarm entity = new AppAlarm();
        entity.setAlarmDate(LocalDateTime.now());
        entity.setAlarmLevel("1");
        entity.setAlarmNo(1);
        entity.setAlarmStatus("1");
        entity.setInfo("test");
        appAlarmService.list();
    }
}
