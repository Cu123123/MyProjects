import com.zhang.dao.UserDao;
import com.zhang.dao.UserDaoImpl;
import com.zhang.dao.UserDaoMysqlImpl;
import com.zhang.service.UserService;
import com.zhang.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //获取ApplicationContext:拿到Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
