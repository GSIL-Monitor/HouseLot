package com.github.zhuozi.houselot.controller;

import com.github.zhuozi.houselot.service.mapper.HousingMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * Email: zhuozi@meili-inc.com
 * Datetime: 2018-12-04 18:32
 */
@RestController
@RequestMapping("/housing")
public class HousingController {
    private static final Logger logger = LoggerFactory.getLogger(HousingController.class);

    @Autowired
    HousingMapper housingMapper;

    @GetMapping("/index")
    public String index() {
        return "当前时间为: " + LocalTime.now();
    }
}
