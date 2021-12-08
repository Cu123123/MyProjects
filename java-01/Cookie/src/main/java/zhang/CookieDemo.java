package zhang;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //获取cookies
        Cookie[] cookies = req.getCookies();
        PrintWriter out = resp.getWriter();
        System.out.println(cookies);
        if(cookies!=null){
            for (int i = 0; i < cookies.length; i++) {
                //得到一个cookie
                Cookie cookie = cookies[i];
                if(cookie.getName().equals("name")){
                    long l = Long.parseLong(cookie.getValue());
                    Date date = new Date(l);
                    out.print(URLDecoder.decode(date.toLocaleString(),"utf-8"));
                }
            }
        }else {
            out.write("这是第一次访问该网站");
        }
        Cookie cookie = new Cookie("name", URLEncoder.encode(System.currentTimeMillis()+"","utf-8"));
        resp.addCookie(cookie);
    }

}
