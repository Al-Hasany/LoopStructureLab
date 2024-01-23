package com.mycompany.loopstructureslab;
import java.util.Scanner;

// Step 1: Set Up.
public class LoopStructuresLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 2
        int count = 0;
        while ( count < 6){
            System.out.print(count + " ");
            count++;
        }
        System.out.println("");
        
        
        // Step 3
        int number;
        do {
            System.out.println("Enter a number from 1-10;");
            number = scanner.nextInt();
        } while((number < 1) || (number > 10));
        
        // Step 4
        int sum = 0;
        for (int i = 0; i < 11; i++){
            sum += i;
        }
        System.out.println(sum);
        
        // Exercises:
        // Exercise 1:
        int num;
        do {
            System.out.println("Enter a positive number:");
            num = scanner.nextInt();
        } while (num < 1);
        
        int x2 = 1;
        while (x2 < num){
            if (x2 % 2 == 0) System.out.println(x2);
            x2++;
        }
        
        // Exercise 2:
        int num2;
        do {
            System.out.println("Enter a positive number:");
            num2 = scanner.nextInt();
        } while (num2 < 1);
        
        int k = 0;
        int sum2 = 0;
        do {
            sum2 += k;
            k++;
        } while (k <= num2);
        System.out.println(sum2);
        // Exercise 3:
        int num3;
        do {
            System.out.print("Enter a positive integer: ");
            num3 = scanner.nextInt();
        } while(num3 < 1 || num3 > 10);
        System.out.println("Multiplication Table for " + num3 + ":");
        for (int i = 1; i < 11; i++){
            System.out.println(num3 + " x " + i + " = " + num3*i);
        }
        
        // Exercise 4:
        int num4 = 0;
        do {
            System.out.print("Enter a positive integer: ");
            num4 = scanner.nextInt();
        } while(num4 < 1 || num4 > 10);
        
        for (int i = 1; i <= num4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
