package com.qiang.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qiang.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
}
