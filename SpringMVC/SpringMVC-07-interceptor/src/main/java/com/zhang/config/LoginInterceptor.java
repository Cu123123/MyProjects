package com.zhang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        System.out.println("当前路径：" + request.getRequestURI());

        if (request.getRequestURI().contains("/user/goLogin")) {
            return true;
        }
        if (request.getRequestURI().contains("/user/login")) {
            return true;
        }
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        if (request.getRequestURI().contains("index")) {
            return true;
        }
        request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
