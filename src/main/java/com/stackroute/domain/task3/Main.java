package com.stackroute.domain.task3;

import com.stackroute.domain.task1.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.ModalExclude;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Movie movie = (Movie)context.getBean("movie");
//        System.out.println(movie);

        Movie movie1 = (Movie)context.getBean("movie1");
        System.out.println(movie1);

        Movie movie2 = (Movie)context.getBean("movie2");
        System.out.println(movie2);
    }
}
