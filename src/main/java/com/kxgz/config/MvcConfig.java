package com.kxgz.config;

import com.kxgz.interceptor.AuthenticationInterceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

@Configuration//标识这是配置类
public class MvcConfig implements WebMvcConfigurer {

    //注册拦截器
    @Bean
    public AuthenticationInterceptor myInterceptor(){
        return new AuthenticationInterceptor();
    }


    //添加拦截器到springmvc拦截器链
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor())
                .addPathPatterns("/**")//拦截所有路径-先通过controller处理器处理，无法处理再交给静态资源处理器处理
                .excludePathPatterns("/**/*.html","/**/*.js","/**/*.css","/**/*.png");//添加不拦截路径
    }

//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//            configurer.mediaType("ext", MediaType.APPLICATION_JSON);// 设置ext放回类型为json
//            configurer.mediaType("in", MediaType.APPLICATION_JSON);// 设置ext放回类型为json
//            configurer.mediaType("do", MediaType.APPLICATION_JSON);// 设置ext放回类型为json
//            configurer.favorPathExtension(false);
//    }


    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        //不移除；号后面的内容，矩阵变量功能可以生效
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }
}
