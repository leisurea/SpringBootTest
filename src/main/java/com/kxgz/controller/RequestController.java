package com.kxgz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request) {

        request.setAttribute("msg", "成功了。。。");
        request.setAttribute("code", 200);
        return "forward:/success";//转发到 /success请求
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                       @RequestAttribute("code") Integer code,
                       HttpServletRequest request) {

        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        map.put("msg1", request.getAttribute("msg"));
        return map;
    }

    //1.语法： /cars/sell;low=34;brand=byd,audi,yd
    //2.springboot 默认禁用矩阵变量功能
    //3.手动开启：原理：对于路径处理UrlPathHelper里的removeSemicolonContent=true,改成false即可

    /**
     * 矩阵变量方式获取路径值
     * 语法： /cars/sell;low=34;brand=byd,audi,yd
     * springboot 默认禁用矩阵变量功能
     * 路径处理UrlPathHelper里遇到 ; 号就结束后续读取
     * 默认值removeSemicolonContent(移除分号内容)=true，改成false
     * 矩阵变量必须有url路径变量才能被解析，不然404
     * @param low
     * @param brand
     * @return
     */
    @ResponseBody
    @GetMapping("/cars/{path}")
    public Map carSell(@MatrixVariable("low") Integer low,
                       @MatrixVariable("brand") List<String> brand,
                       @PathVariable("path") String path) {
        Map<String, Object> map = new HashMap<>();

        map.put("path", path);
        map.put("low", low);
        map.put("brand", brand);
        return map;
    }

    /**
     * /boss/1;age=20/2;age=10
     * @return
     */
    @ResponseBody
    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") Integer empAge) {
        Map<String, Object> map = new HashMap<>();

        map.put("bossAge", bossAge);
        map.put("empAge", empAge);
        return map;
    }

}
