package com.kxgz.config;

import com.kxgz.interceptor.MyInterceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration//标识这是配置类
public class MvcConfig implements WebMvcConfigurer {

    //注册拦截器
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }


    //添加拦截器到springmvc拦截器链
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");//拦截所有路径
    }

//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//            configurer.mediaType("ext", MediaType.APPLICATION_JSON);// 设置ext放回类型为json
//            configurer.mediaType("in", MediaType.APPLICATION_JSON);// 设置ext放回类型为json
//            configurer.mediaType("do", MediaType.APPLICATION_JSON);// 设置ext放回类型为json
//            configurer.favorPathExtension(false);
//    }


}
