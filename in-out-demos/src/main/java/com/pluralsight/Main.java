package com.pluralsight;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);





        System.out.print("Please enter your name: ");



        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Please enter a number 1: ");

        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter a number 2: ");

        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("If you add %d and %d you get the sum of %d" , num1, num2, (num1 + num2)  );




    }
}
