package com.me.demo.web;

import com.me.demo.config.QQConfig;
import com.me.demo.config.QQConfig1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @Autowired
    private QQConfig qqConfig;

    @Autowired
    private QQConfig1 qqConfig1;

    @RequestMapping("/hello")
    public String index() {
        System.out.println("配置一：" + qqConfig.getAppKey()+" ||| "+ qqConfig.getAppPwd());
        System.out.println("配置二：" + qqConfig1.getAppKey()+" ||| "+ qqConfig1.getAppPwd() + "  |||  " + qqConfig1.getUsers()+",共"+qqConfig1.getUsers().size());
        return "index";
    }
}
