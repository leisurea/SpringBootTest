package com.kxgz.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kxgz.api.JsonResult;
import com.kxgz.api.PassToken;
import com.kxgz.api.UserLoginToken;
import com.kxgz.server.TokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Token拦截器
 * 需要注册到MvcConfig配置中才生效
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    TokenService tokenService;

    /**
     * 执行处理器之前执行
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("这是MyInterceptor的preHandle方法");
        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }

        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()) {

                Map map = new HashMap();
                Enumeration<String> paramNames = request.getParameterNames();
                String signature = request.getParameter("sign");
                if (!StringUtils.hasLength(signature)) {
                    ObjectMapper mapper = new ObjectMapper();
                    String error = mapper.writeValueAsString(new JsonResult("1100", "签名信息异常"));
                    returnJson(response, error);
                    return false;
                }
                //获取所有的请求参数
                while (paramNames.hasMoreElements()) {
                    String paramName = paramNames.nextElement();
                    String[] paramValues = request.getParameterValues(paramName);

                    if (paramValues.length > 0) {
                        String paramValue = paramValues[0];
                        System.out.println(paramName);
                        if (paramValue.length() != 0 && !"sign".equals(paramName)) {
                            map.put(paramName, paramValue);
                        }
                    }
                }

                Set setKey = map.keySet();
                Object[] keys = setKey.toArray();
                // 将请求参数升序排序
                Arrays.sort(keys);

                StringBuilder strBuilder = new StringBuilder();
                for (Object str : keys) {
                    strBuilder.append(str.toString() + "=" + map.get(str.toString()) + "&");
                }
                strBuilder.append("key=").append("12345678");
                System.out.println(strBuilder.toString());
                String newSignature = DigestUtils.md5DigestAsHex(strBuilder.toString().getBytes()).toLowerCase();

                if (!signature.equals(newSignature)) {
//                    response.setStatus(403);
                    ObjectMapper mapper = new ObjectMapper();
                    String error = mapper.writeValueAsString(new JsonResult("1100", "签名信息异常"));
                    returnJson(response, error);
                    return false;
                }


//                // 执行认证
//                if (token == null) {
//                    throw new RuntimeException("无token，请重新登录");
//                }
//                // 获取 token 中的 user id
//                String userId;
//                try {
//                    userId = JWT.decode(token).getAudience().get(0);
//                } catch (JWTDecodeException j) {
//                    throw new RuntimeException("401");
//                }
//                UserDo user = userService.findUserById(userId);
//                if (user == null) {
//                    throw new RuntimeException("用户不存在，请重新登录");
//                }
//                // 验证 token
//                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getUserPasswd())).build();
//                try {
//                    jwtVerifier.verify(token);
//                } catch (JWTVerificationException e) {
//                    throw new RuntimeException("401");
//                }
                return true;
            }
        }

        return true;//返回false就拦截，不会往下走
    }

    private void returnJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
//            logger.error("response error",e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }


    /**
     * 执行处理器之后执行
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("这是MyInterceptor的postHandle方法");
    }

    /**
     * 界面渲染了执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("这是MyInterceptor的afterCompletion方法");
    }
}
