import com.zhang.pojo.Student;
import com.zhang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user==user1);
    }
}
