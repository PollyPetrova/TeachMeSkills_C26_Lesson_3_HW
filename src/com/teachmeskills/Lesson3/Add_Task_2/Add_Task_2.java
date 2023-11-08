package com.teachmeskills.Lesson3.Add_Task_2;

import java.util.Scanner;
import java.lang.Math;

public class Add_Task_2 {

    public static void main(String[] args) {

        System.out.println("Enter the number of figure: ");
        System.out.println("1: rectangle;");
        System.out.println("2: triangle;");
        System.out.println("3: circle;");
        Scanner scanner=new Scanner(System.in);
        int figure=scanner.nextInt();
        double s;
        switch (figure){
            case 1:
                System.out.println("Enter the length of sides: ");
                double a=scanner.nextDouble();
                double b=scanner.nextDouble();
                System.out.println("a= "+ a);
                System.out.println("b= "+ b);
                s=a*b;
                System.out.println("Square= "+s);
                break;
            case 2:
                System.out.println("Enter the length of sides: ");
                double c=scanner.nextDouble();
                double d=scanner.nextDouble();
                double e=scanner.nextDouble();
                System.out.println("c= "+ c);
                System.out.println("d= "+ d);
                System.out.println("e= "+ e);
                double p=(c+d+e)/2;
                s=Math.pow((p*(p-c)*(p-d)*(p-e)), 1./2);
                System.out.println("Square= "+s);
                break;
            case 3:
                System.out.println("Enter the length of radius: ");
                double r=scanner.nextDouble();
                System.out.println("r= "+ r);
                s=Math.PI*Math.pow(r,2);
                System.out.println("Square= "+s);
                break;
            default:
                System.out.println("Wrong number!");
        }

    }

}