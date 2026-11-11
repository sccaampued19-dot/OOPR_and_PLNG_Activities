package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Week_13_Assignment_No_2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int[] numbers = new int[5]; 
        int larger = 0;
        int diff = 0;
        System.out.print("Enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            if (larger < numbers[i]){
                larger = numbers[i];
            }
        }
        System.out.print("The highest is: ");
        System.out.print(larger);
        
        System.out.println("The differnce from the highest are:");
        
        for (int i = 0; i < 5; i++){
            diff = larger - numbers[i];
            System.out.println(larger + " - " + numbers[i] + " = " + diff);
        }
        scanner.close();
    }
}
