package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_3 {
   public static void main (String [] args){
       Scanner scanner = new Scanner (System.in);
       String answer;
       
       do {
           System.out.print("Enter a temperature: ");
           double temp = scanner.nextDouble();

           if (temp < 0) {
               System.out.println("ICE");
           } else if (temp >= 0 && temp <= 100) {
               System.out.println("WATER");
           } else if (temp > 100) {
               System.out.println("STEAM");
           }
           
           System.out.print("\nWould you like to enter another temperature? (yes/no): ");
           answer = scanner.next();
       } while (answer.equalsIgnoreCase("yes"));
       
       System.out.println("\nProgram terminated. Goodbye!");
       scanner.close();
   } 
}
