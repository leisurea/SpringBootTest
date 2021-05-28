package com.kxgz.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * PropertySource java方式配置，只能配置简单的数据类型，无法配置到对象中
 */
@Deprecated
//@Configuration//标注这是配置类-使用内置的hikari
//@PropertySource("classpath:jdbc.properties")//第一种配置方法：指明配置文件路径
//@EnableConfigurationProperties(JdbcProperties.class)//第二种配置方法：指明绑定类
public class JdbcConfig {

    /////////////////PropertySource方法/////////////////
//    @Value("${jdbc.url}")
//    String url;
//
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//
//    @Value("${jdbc.username}")
//    String username;
//
//    @Value("${jdbc.password}")
//    String password;
//
//    /**
//     * 注册一个数据源
//     * @return
//     */
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }

    /////////////////EnableConfigurationProperties方法/////////////////
//    @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }
    /////////////////EnableConfigurationProperties方法/////////////////
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")//将配置文件中属性直接使用在方法上，另一种是直接赋值给当前类
//    public DataSource dataSource() {
//        //配置文件application中前缀jdbc相符的属性直接通过get set方法赋值
//        return new DruidDataSource();
//    }
}
