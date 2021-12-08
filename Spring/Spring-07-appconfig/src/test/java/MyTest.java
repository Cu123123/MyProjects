import com.zhang.config.ZhangConfig;
import com.zhang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载。
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ZhangConfig.class);
        User getUser = context.getBean("user", User.class);
        System.out.println(getUser.getName());
    }
}
