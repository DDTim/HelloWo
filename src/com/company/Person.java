package com.company;

/**
 * Created by Никита on 06.04.2017.
 */
public class Person {
    public int height = 180;
    public String name;

    public void say(String name){
        System.out.println("Hello, " + name);
    }
    public Person(int h, String n) {
        height = h;
        name = n;
    }
    public Person() {
    }
    public Person(String n){
        name = n;
    }
}
