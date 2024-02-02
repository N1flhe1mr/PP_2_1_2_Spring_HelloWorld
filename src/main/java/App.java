import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBeanSecond = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(beanSecond.getMessage());
        System.out.println(catBean.getMessage());
        System.out.println(catBeanSecond.getMessage());
        System.out.println(bean.equals(beanSecond));
        System.out.println(catBean.equals(catBeanSecond));
    }
}