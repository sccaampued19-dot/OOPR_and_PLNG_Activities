package com.mycompany.ooprproj1; 
import java.util.Scanner; 

public class midterm_lab_activity2_5 { 
    public static void main (String [] args){ 
        Scanner scanner = new Scanner (System.in); 
        String answer; 
        
        do {
            System.out.print("Enter the Class ID: "); 
            String input = scanner.next();

                char letter = input.toUpperCase().charAt(0); 
                
                switch (letter){ 
                    case 'B': 
                        System.out.println("Battleship");
                        break;
                    case 'C': 
                        System.out.println("Cruiser");
                        break;
                    case 'D': 
                        System.out.println("Destroyer");
                        break;
                    case 'F': 
                        System.out.println("Frigate");
                        break;
                    default:
                        System.out.println("Please choose only from B, C, D, F");
                } 

            System.out.print("\nWould you like to enter another letter? (yes/no): ");
            answer = scanner.next(); 
            
        } while(answer.equalsIgnoreCase("yes")); 
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
