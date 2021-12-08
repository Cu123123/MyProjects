package zhang;

import zhang.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("utf-8");
       resp.setCharacterEncoding("utf-8");
       resp.setContentType("text/html;charset=utf-8");
       //得到session
        HttpSession session = req.getSession();
        session.setAttribute("name",new Person("张",18));
        PrintWriter writer = resp.getWriter();
        //得到session的Id
        String sessionId = session.getId();
        if (session.isNew()){
            writer.write("这是第一个session，sessionId："+sessionId);
        }else {
            writer.write("已有Session，sessionId为："+sessionId);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
