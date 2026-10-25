package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_4 {
   public static void main (String [] args){
       Scanner scanner = new Scanner (System.in);
       String answer;
       
       do {
           System.out.print("Enter speed (km/h): ");
           int speed = scanner.nextInt();
           System.out.print("Enter length (meters): ");
           int length = scanner.nextInt();

           if (speed > 1100 && length > 52) {
               System.out.println("CIVILIAN");
           } else if (speed <= 1100 && speed > 500 && length <= 52) {
               System.out.println("MILITARY");
           } else if (speed <= 500) {
               System.out.println("It's a bird");
           } else {
               System.out.println("Unknown Target");
           }

           System.out.print("\nWould you like to enter another aircraft? (yes/no): ");
           answer = scanner.next();
       } while (answer.equalsIgnoreCase("yes"));
       
       System.out.println("\nProgram terminated. Goodbye!");
       scanner.close();
   } 
}
