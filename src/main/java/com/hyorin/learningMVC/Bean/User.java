package com.hyorin.learningMVC.Bean;

public class User {
    public String name;
    public long id;
    public School school;

    public User(String name, long id, School school) {
        this.name = name;
        this.id = id;
        this.school = school;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", school=" + school +
                '}';
    }
}
