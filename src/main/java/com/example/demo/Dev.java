/*package com.example.demo;

//Dependency injection using spring boot
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //3 way for using dependency injection(DI)

    // 1 field injection
     private Laptop laptop;

    /*2 USE constructor injection
    private Laptop laptop;

    public Dev(Laptop laptop){
        this.laptop = laptop;
    } */

    //3 setter injection with the use of @Autowired anotations

    /*@Autowired
    public void setInjection(Laptop laptop){
        this.laptop = laptop;

    }
    /*NOTE: for spring to know which class is connect to each is by the uses of @Autowired anotations,
     which is  use to connect two class together, and autowires is always check by TYPE.
     e.g suppose we the name i use as field injection name in my  class called
     */
    /*public  void build(){
        Laptop.compile();
        System.out.println("we are building our first dependency injection");

    }
} */
