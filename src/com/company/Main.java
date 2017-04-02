package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String str = "Hello";
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

        String r = (f % 2) == 0 ? " Четное" : " Не четное";
        System.out.println(f + r);
        r = (s % 2) == 0 ? " Четное" : " Не четное";
        System.out.println(s + r);
        r = (s!=f && s == 3)? "s!= f и s == 3": "не";
        System.out.println(r);
    }
}
