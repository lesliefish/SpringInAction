import beaninheritance.BeanInheritance1;
import beaninheritance.BeanInheritance2;
import beanlifecycle.BeanLifeCycleTest;
import beanpostprocessor.BeanPostProcessorDemo;
import dependencyinjection.ConstructorBased;
import helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scopedemo.PrototypeScopeDemo;
import scopedemo.SingletonScopeDemo;

public class Application
{

    public static void main(String[] args)
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        ConstructorBased constructorBased = (ConstructorBased) context.getBean("constructorBased");
        constructorBased.saySth();
    }
}
