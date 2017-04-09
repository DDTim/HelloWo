package com.company;

/**
 * Created by Никита on 07.04.2017.
 */
public class Cucumber extends Student {
    public int activ = 0;

    public Cucumber(int h, String n, int course) {
        super(h, n, course);
    }
    public  Cucumber(int activ){
        this.activ = activ;
    }
    public void Who_Im(){
        System.out.print("My activity = " + activ);
        if (activ < 100) System.out.println(" I'm Student");
        if (activ > 100) System.out.println(" I'm FADINAAA!!!!");
        if (activ == 100) System.out.println(" I'm Gorn!");

    }
}
