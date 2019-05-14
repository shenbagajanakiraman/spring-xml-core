package com.stackroute.domain.task2;

import com.stackroute.domain.task1.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie3");
        Movie movie1 = (Movie) context.getBean("movie3");

        System.out.println(movie);

        System.out.print(" Scope : Singleton   ");

        System.out.println(movie == movie1);

        Movie movie2 = (Movie) context.getBean("movie1");
        Movie movie3 = (Movie) context.getBean("movie1");

        System.out.println(movie);

        System.out.print(" Scope : Prototype  ");
        System.out.println(movie2 == movie3);



    }
}
