package com.mycompany.ooprproj1;

import java.util.Scanner;

public class Week7_Assignment1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("--- ODD or EVEN ---");

        while (true) { 
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            
            if (num % 2 == 0){
                System.out.println("It's an even number!");
            } else {
                System.out.println("It's an odd number!");
            }
            
            System.out.print("\nWould you like to enter another number: ");
            scanner.nextLine(); 
            String answer = scanner.nextLine(); 
            
            if (!answer.equalsIgnoreCase("yes")) {
                break; 
            }
        }
        scanner.close();
    }
}