package com.company;
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
        for (int i = 10; i < 21; i++)
            System.out.println(i * i);
        for (int i = 25; i < 30; i++)
            if (i != 27) System.out.println(i);
        int y = 25;
        while (y < 30) {
            if (y != 27) System.out.println(y);
            y++;
        }
    }
}