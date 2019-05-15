package com.stackroute.domain.task3;

import com.stackroute.domain.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

       Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie);





    }



}
