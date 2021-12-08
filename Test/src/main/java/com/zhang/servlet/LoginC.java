package com.zhang.servlet;

import com.zhang.entity.User;
import com.zhang.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginC extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        UserService us = new UserService();
        User user = us.login(username, password);
        if (user!=null){
            //session作用域
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            //重定向
            resp.sendRedirect("welcome.jsp");
        }else {
            //用户名或密码错误
            req.setAttribute("errMsg","用户名或密码错误，请重新输入！");
            req.getRequestDispatcher("Login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
