package com.stackroute.domain.task3;


import com.stackroute.domain.task3.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actor;

    public Movie() {

    }

@Autowired
    public Movie(Actor actor) {

        actor.setAge(25);
        actor.setName("Arjun");
        actor.setGender("Male");

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
}
