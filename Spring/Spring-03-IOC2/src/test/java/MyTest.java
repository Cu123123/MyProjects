import com.zhang.pojo.User;
import com.zhang.pojo.UserT;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //Spring容器：类似于婚介网站
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user =(UserT) context.getBean("111");

        user.show();
    }
}
