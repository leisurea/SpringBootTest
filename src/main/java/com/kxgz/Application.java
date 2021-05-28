package com.kxgz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring-boot工程都有一个启动引导类，这是工程的入口类
 * springboot添加新功能一般都是直接pom里添加启动器即可
 */
@SpringBootApplication
@MapperScan("com.kxgz.mapper")//扫描mybatis所有的业务mapper接口
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
