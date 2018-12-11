import helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scopedemo.PrototypeScopeDemo;
import scopedemo.SingletonScopeDemo;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();

        SingletonScopeDemo ssd = (SingletonScopeDemo)context.getBean("singletonScope");
        ssd.setMessage("i am ssd.");
        ssd.getMessage();

        SingletonScopeDemo ssd2 = (SingletonScopeDemo)context.getBean("singletonScope");
        ssd2.getMessage();

        PrototypeScopeDemo psd = (PrototypeScopeDemo)context.getBean("prototypeScope");
        psd.setMessage("psd");
        psd.getMessage();

        PrototypeScopeDemo psd2 = (PrototypeScopeDemo)context.getBean("prototypeScope");
        psd2.getMessage();
    }
}
