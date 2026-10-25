package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_6 {
   public static void main (String [] args){
       Scanner scanner = new Scanner (System.in);
       String answer;
       
       do {
           System.out.print("Enter a number from the richter scale: ");
           double richter = scanner.nextDouble();

           if (richter < 5.0) { 
               System.out.println("little or no damage");
           } else if (richter >= 5.0 && richter < 5.5) {
               System.out.println("some damage");
           } else if (richter >= 5.5 && richter < 6.5) {
               System.out.println("serious damage");
           } else if (richter >= 6.5 && richter < 7.5) {
               System.out.println("disaster");
           } else {
               System.out.println("catastrophe");
           }
           
           System.out.print("\nWould you like to enter another number from the richter scale? (yes/no): ");
           answer = scanner.next();
       } while (answer.equalsIgnoreCase("yes"));
       
       System.out.println("\nProgram terminated. Goodbye!");
       scanner.close();
   } 
}
