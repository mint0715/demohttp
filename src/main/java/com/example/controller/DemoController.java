package com.example.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@RestController
public class DemoController {

    Random rand = new Random();

    @RequestMapping("/**")
    public String index(
            @RequestParam(value = "timezone", required = false) String type
    ) throws Exception {
        Thread.sleep(45*1000L);
        return "test";
    }
}
