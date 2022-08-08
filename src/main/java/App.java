import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld tree = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld leaf = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(tree.equals(leaf));

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);
        System.out.println(one.equals(two));
    }
}
