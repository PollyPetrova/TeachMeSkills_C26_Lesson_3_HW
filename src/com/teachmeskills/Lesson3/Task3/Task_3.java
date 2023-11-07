package com.teachmeskills.Lesson3.Task3;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("The number is an even(chetnoye)");
        }
        else {
            System.out.println("The number is an odd(niechetnoye)");
        }

    }

}
