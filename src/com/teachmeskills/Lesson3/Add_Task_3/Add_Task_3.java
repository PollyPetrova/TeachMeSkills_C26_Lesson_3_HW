package com.teachmeskills.Lesson3.Add_Task_3;

import java.util.Scanner;

public class Add_Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        while(n != 0){
            sum += (n % 10);
            n=n/10;
        }
        System.out.println(sum + " ");
    }

}