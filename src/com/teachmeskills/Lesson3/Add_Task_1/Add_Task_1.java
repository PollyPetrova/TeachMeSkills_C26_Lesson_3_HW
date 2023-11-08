package com.teachmeskills.Lesson3.Add_Task_1;

import java.util.Scanner;

public class Add_Task_1 {

    public static void main(String[] args) {

        long a=0L, b=1L;
        System.out.println("Enter number of numbers(n): ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n>100) {
            System.out.println("Enter another number, less than 100!");
        }
        else
        {
            System.out.print(a+ " "+ b+ " ");
            for(int i=0; i<=n-3; i++){
                long sum=a+b;
                System.out.print(sum+ " ");
                a=b;
                b=sum;
            }
        }

    }

}