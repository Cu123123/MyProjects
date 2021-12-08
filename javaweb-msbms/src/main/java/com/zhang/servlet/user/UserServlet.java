package com.zhang.servlet.user;

import com.mysql.cj.util.StringUtils;
import com.zhang.dao.User.UserDaoImpl;
import com.zhang.pojo.User;
import com.zhang.service.UserService;
import com.zhang.service.UserServiceImpl;
import com.zhang.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if(method.equals("savepwd")&&method!=null){
            this.updatePwd(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
    public void updatePwd(HttpServletRequest req, HttpServletResponse resp){
        Object o = req.getSession().getAttribute(Constants.USER_SESSION);

        String newpassword = req.getParameter("newpassword");

        boolean flag = false;

        if(o!=null && !StringUtils.isNullOrEmpty(newpassword)){
            UserService userService = new UserServiceImpl();
            flag = userService.updatePwd(((User) o).getId(), newpassword);
            if(flag){
                req.setAttribute("message","修改密码成功，请退出使用新密码登录");
                //密码修改成功，移除当前Session
                req.getSession().removeAttribute(Constants.USER_SESSION);
            }else {
                req.setAttribute("message","密码修改失败");
            }
        }else {
            req.setAttribute("message","新密码有问题");
        }

        try {
            req.getRequestDispatcher("pwdmodify.jsp").forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
