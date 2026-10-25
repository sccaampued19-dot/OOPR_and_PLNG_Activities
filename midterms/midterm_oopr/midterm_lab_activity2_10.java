package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_10 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String answer;
        
        do {
            System.out.print("Enter a grade number: ");
            int num = scanner.nextInt();
 
            if (num > 100) {
                System.out.println("Out of Range");
            } else if (num >= 98){  
                System.out.println("1.00");
            } else if (num >= 95){  
                System.out.println("1.25");
            } else if (num >= 92){  
                System.out.println("1.50");
            } else if (num >= 89){  
                System.out.println("1.75");
            } else if (num >= 85){  
                System.out.println("2.00");
            } else if (num >= 82){  
                System.out.println("2.25");
            } else if (num >= 80){ 
                System.out.println("2.50");
            } else if (num >= 77){ 
                System.out.println("2.75");
            } else if (num >= 75){ 
                System.out.println("3.00");
            } else {               
                System.out.println("Out of Range");
            }
            
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
            
        } while(answer.equalsIgnoreCase("yes"));
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
