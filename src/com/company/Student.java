package com.company;

/**
 * Created by Никита on 07.04.2017.
 */
public class Student extends Person{
    public int course = 1;

    public Student() {

    }

    public void tell (){
        System.out.println(super.name);
        System.out.println(super.height);
        System.out.println(course);
    }
    public Student (int h, String n, int course){
        super(h,n);
        this.course = course;
     }
}
