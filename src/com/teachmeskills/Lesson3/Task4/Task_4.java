package com.teachmeskills.Lesson3.Task4;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        System.out.println("Enter the temperature:");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if(t> -5){
            System.out.println("Warm");
        }
        else if(t> -20){
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }

    }

}
