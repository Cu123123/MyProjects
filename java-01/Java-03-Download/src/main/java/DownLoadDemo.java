import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class DownLoadDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String realPath="D:\\IdeaProjects\\java-01\\Java-03-Download\\src\\main\\resources\\张.png";
            String fileName= realPath.substring(realPath.lastIndexOf("\\")+1);
            resp.setHeader("Content-Disposition","attachment;fileName="+ URLEncoder.encode(fileName,"utf-8"));
            FileInputStream is = new FileInputStream(realPath);
            ServletOutputStream os = resp.getOutputStream();
            int len=0;
            byte[] buffer = new byte[1024];
            while ((len=is.read(buffer))>0){
                os.write(buffer);
            }
            is.close();
            os.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
