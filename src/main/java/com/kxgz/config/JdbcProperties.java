package com.kxgz.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ConfigurationProperties 从application(必须以这个前缀开头)配置文件中读取配置项
 * prefix配置项的前缀
 * 配置类中类变量名须与当前类变量名保持松散绑定（字段不一定要完全一致，支持驼峰、中划线、下划线等命名法）
 */
//@ConfigurationProperties(prefix = "jdbc")//将配置文件中属性直接赋值给当前类，另一种是直接使用在方法上
public class JdbcProperties {

    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
