import beaninheritance.BeanInheritance1;
import beaninheritance.BeanInheritance2;
import beanlifecycle.BeanLifeCycleTest;
import beanpostprocessor.BeanPostProcessorDemo;
import helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scopedemo.PrototypeScopeDemo;
import scopedemo.SingletonScopeDemo;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        BeanInheritance1 objA = (BeanInheritance1) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        BeanInheritance2 objB = (BeanInheritance2) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
