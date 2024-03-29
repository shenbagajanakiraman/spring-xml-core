package com.stackroute.domain.task1;

import com.stackroute.domain.task1.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        // Using XML Bean factory

        System.out.println("\n******Using Bean Factory******");

        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Movie movie1 = (Movie) beanFactory.getBean("movie1");  /* Lazy instantiation */

        System.out.println(movie1);


        //Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader


        System.out.println("\n******Using BeanDefinitionRegistry and BeanDefinitionReader******");

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie2=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie2");

        System.out.println(movie2);


        //Using Application context

        System.out.println("\n******Using Application context******");


        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3 = (Movie) context.getBean("movie3");

        System.out.println(movie3);





    }
}
