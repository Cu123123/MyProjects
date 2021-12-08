package com.zhang.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain Chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if(req.getSession().getAttribute("USER_SESSION")==null){
            resp.sendRedirect("/error.jsp");

        }
        Chain.doFilter(req,resp);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
