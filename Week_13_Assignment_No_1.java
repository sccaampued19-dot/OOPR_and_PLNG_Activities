package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Week_13_Assignment_No_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\nHere is the list of Even number/s: ");

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}