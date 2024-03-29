package com.stackroute.domain.task1;

public class Actor {
 private String name ;
 private String gender;
 private int age;

    public Actor() {
    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //override String method

    @Override
    public String toString() {
        return "Actor details..." +
                "\n\tName='" + name  + "'" +
                "\n\tGender='" + gender  + "'"+
                "\n\tAge=" + age ;
    }
}