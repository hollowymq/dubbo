package com.qiang.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qiang.dubbo.api.service.DemoService;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+" i am provider!!!";
    }
}
