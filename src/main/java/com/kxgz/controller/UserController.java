package com.kxgz.controller;

import com.kxgz.api.JsonResult;
import com.kxgz.api.UserLoginToken;
import com.kxgz.pojo.User;
import com.kxgz.server.UserServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserServer userServer;

    @UserLoginToken
    @GetMapping("/user/{id}")
    public JsonResult queryById(@PathVariable("id") Long id,
//                                @RequestBody String content,//只有POST请求才有值
                                @PathVariable Map<String, String> total,
                                @RequestParam Map<String, String> totalPar,
                                @RequestHeader("User-Agent") String userAgent,
                                @RequestHeader Map<String, String>headers) {
        User user = userServer.queryById(id);
        return new JsonResult<>(user);
    }

    //    @ResponseBody//这是返回给浏览器的，已字符串形式
    @RequestMapping(value = "/index", method = RequestMethod.GET)//默认get和post两种
    public String indedx() {
        return "index";
    }

    /**
     * 1.直接把表单的参数写在Controller相应的方法的形参中
     * 适用于get方式提交，不适用于post方式提交。
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/addUser1")
    public String addUser1(String username, String password) {
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }

    /**
     * 2、通过HttpServletRequest接收，post方式和get方式都可以。
     *
     * @param request
     * @return
     */
    @RequestMapping("/addUser2")
    public String addUser2(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }

    /**
     * 3、通过一个bean来接收 post方式和get方式都可以
     *
     * @param user
     * @return
     */
    @RequestMapping("/addUser3")
    public String addUser3(User user) {
        System.out.println("username is:" + user.getUserName());
        System.out.println("password is:" + user.getPassword());
        return "demo/index";
    }

    /**
     * 4、通过@PathVariable获取路径中的参数
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/addUser4/{username}/{password}", method = RequestMethod.GET)
    public String addUser4(@PathVariable String username, @PathVariable String password) {
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }

    /**
     * 5、使用@ModelAttribute注解获取POST请求的FORM表单数据
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser5", method = RequestMethod.POST)
    public String addUser5(@ModelAttribute("user") User user) {
        System.out.println("username is:" + user.getUserName());
        System.out.println("password is:" + user.getPassword());
        return "demo/index";
    }

    /**
     * 6、用注解@RequestParam绑定请求参数到方法入参
     * 当请求参数username不存在时会有异常发生,可以通过设置属性required=false解决,
     * 例如: @RequestParam(value="username", required=false)
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/addUser6", method = RequestMethod.GET)
    public String addUser6(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }
}
