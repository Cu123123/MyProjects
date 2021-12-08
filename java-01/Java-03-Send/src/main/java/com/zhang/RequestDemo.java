package com.zhang;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class RequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobbies");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        System.out.println(username+":"+password);
        System.out.println(Arrays.toString(hobbies));
        resp.getWriter().print("RequsetDemo");
//        resp.sendRedirect("/success.jsp");
        req.getRequestDispatcher("/success.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
