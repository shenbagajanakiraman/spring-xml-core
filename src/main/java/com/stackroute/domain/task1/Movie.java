package com.stackroute.domain.task1;

import com.stackroute.domain.task1.Actor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware {

    private Actor actor;

    public Movie() {

    }

    public Movie(Actor actor) {

        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "\nFetching Actor details from Movie class.." +
                "\n" + actor;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("Application context... \n"+applicationContext);
        Actor actor = (Actor) applicationContext.getBean("Actor");
        System.out.println(actor);
    }
}
