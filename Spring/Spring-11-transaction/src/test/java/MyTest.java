import com.zhang.mapper.UserMapper;
import com.zhang.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = context.getBean("UserMapper", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
