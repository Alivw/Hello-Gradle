package org.example.config;

import org.example.component.EnablePrint;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Jalivv
 * @create: 2022-10-17 16:13
 **/

@Component
public class PrintBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass().getSuperclass().isAnnotationPresent(EnablePrint.class)){
            System.out.println(bean.getClass().getSuperclass().getAnnotation(EnablePrint.class).value());
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
