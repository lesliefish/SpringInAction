package beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeanPostProcessorDemo implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return o; // 也可以返回其他任何对象
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return o; // 也可以返回其他任何对象
    }
}
