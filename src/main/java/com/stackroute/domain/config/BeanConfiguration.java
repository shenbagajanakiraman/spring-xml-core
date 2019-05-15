package com.stackroute.domain.config;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {



    @Bean(name = "actor")
    public Actor getMovieActor()
    {
        return new Actor("Suriya","Male",43);
    }

    @Bean(name = "movie")
    public Movie getMovieBean()
    {
        return new Movie(new Actor("Suriya","Male",43));
    }
}


