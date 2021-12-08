package com.zhang.filter;

import com.zhang.pojo.User;
import com.zhang.utils.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain Chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        User user = (User) request.getSession().getAttribute(Constants.USER_SESSION);
        if(user==null){
            response.sendRedirect("/smbms/error.jsp");
        }else {
            Chain.doFilter(req,resp);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
