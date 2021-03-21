import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Класс App содержит метод main, который запускает Спринг при создании контекста.
// В контекст мы передаем класс AppConfig, который помечен аннотацией
// @Configuration - так Спринг понимает, что это настроечный класс.
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanhw =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanhw1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanc =
                (Cat) applicationContext.getBean("cat");
        Cat beanc1 =
                (Cat) applicationContext.getBean("cat");

        System.out.println(beanhw.getMessage());
        System.out.println(beanc.getName());

        System.out.println("Переменные beanhw и beanhw1 ссылаются на один и тот же объект?  - " + (beanhw == beanhw1));

        System.out.println("Переменные beanc и beanc1 ссылаются на один и тот же объект?  - " + (beanc == beanc1));
    }
}