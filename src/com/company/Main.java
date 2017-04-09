package com.company;

import java.util.Arrays;
import java.util.Scanner;

//import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
 /*       String str;
        //System.out.println(str);
        Scanner num = new Scanner(System.in);
        int f, s; //r;
        System.out.println("Enter f num: ");
        f = num.nextInt();
        System.out.println("Enter s num: ");
        s = num.nextInt();
        System.out.println(f + " + " +s+ " = " +(f+s));
        System.out.println(f + " - " +s+ " = " +(f-s));
        System.out.println(f + " % " +s+ " = " +(f%s));

//less 7

        str = (f % 2) == 0 ? " Четное" : " Не четное";
        System.out.println(f + str);

        str = (s % 2) == 0 ? " Четное" : " Не четное";
        System.out.println(s + str);

        str = (s!=f || s == 3)? "s!= f и s == 3": "не";
        System.out.println(str);

        str = f == 7? "f = 7":(f==3? "f = 3" : "Не то!");
        System.out.println(str);*/

        // less 8
    /*    for (int i = 10; i < 21; i++)
            System.out.println(i * i);
        for (int i = 25; i < 30; i++)
            if (i != 27) System.out.println(i);
        int y = 25;
        while (y < 30) {
            if (y != 27) System.out.println(y);
            y++;
        }*/
/*
// less 9
        int[] a;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter n[" + i + "] = ");
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("max a[i] = " + a[a.length - 1]);
*/
//less 13
       /* Person vitya = new Person();
        vitya.height = 120;
        System.out.println(vitya.height);
        Person vlad = new Person();
        System.out.println(vlad.height);
        vitya.say("Leha");*/
// less 14
        /*Person vitya = new Person(120, "Vitya");
        vitya.height = 120;
        System.out.println(vitya.height + " " + vitya.name);
        Person vlad = new Person();
        System.out.println(vlad.height);
        vitya.say("Leha");
        Person ns = new Person(123,"Fras");
        System.out.println(ns.name);*/
// less 15
/*        Person vitya = new Person(120, "Vitya");
        vitya.height = 120;
        System.out.println(vitya.height + " " + vitya.name);
        Person vlad = new Person();
        System.out.println(vlad.height);
        vitya.say("Leha");
        Person ns = new Person(123,"Fras");
        System.out.println(ns.name);

        Student freshman = new Student(76,"Hyy",1);
        System.out.println(freshman.name);
        freshman.tell();

        Scanner in = new Scanner(System.in);
        System.out.print("Activ cucumber : " );
        int act = in.nextInt();
        Cucumber asad = new Cucumber(act);
        asad.Who_Im();*/
//        Shape[] arr = new  Shape[]{new Circle(), new Square(), new Triangle()};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i].draw();
//        }
//less 17
   /*   Computer comp = new Computer();
        comp.i7.start();
        comp.transfer.start();*/
/*   new Computer(){
       public void superComp(){
           this.i7.start();
           this.transfer.start();
           System.out.println("Super");
       }
      };*/
//less 18
/*        Shape1 circle = new Circle1();
        circle.draw();
        Shape1 sphere = new Sphere();
        sphere.getName();*/
//less 20
/*        System.out.println(summ(3,4));
        System.out.println(summ(3,4,5));*/
// less 21        System.out.println(Circle.r());


// less 22
        Array a = new MyArray();
        System.out.println(a.Add(3));
        System.out.println(a.Add(4));
        System.out.println(a.Add(5));
        System.out.println(a.Add(6));
        System.out.println(a.Add(33));
        System.out.println(a.Get(3));

        Array b = new Array_1();
        System.out.println(b.Add(3));
        System.out.println(b.Add(4));
        System.out.println(b.Add(5));
        System.out.println(b.Add(6));
        System.out.println(b.Get(4));
    }
    /*  public static int summ(int a, int b){
        return a + b;
    }
    public static int summ(int a, int b, int c){
        return a + b + c;
    }*/
}