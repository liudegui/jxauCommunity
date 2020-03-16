package com.liudegui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能

@Configuration
//@EnableWebMvc//  不要接管SpringMVC
public class MvcConfig extends WebMvcConfigurerAdapter {

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                //registry.addViewController("/user/login").setViewName("main");
                //registry.addViewController("/main.html").setViewName("login");
            }


        };

        return adapter;
    }


}
