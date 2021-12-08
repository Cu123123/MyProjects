import com.zhang.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);

    }
}
