package com.mycompany.ooprproj1; 
import java.util.Scanner; 

public class midterm_lab_activity2_1 { 
    public static void main (String [] args){ 
        Scanner scanner = new Scanner (System.in); 
        String answer; 
        
        do {
            System.out.print("Enter a letter: "); 
            String input = scanner.next();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input! Please enter only one letter.");
            } else {
                char letter = input.toUpperCase().charAt(0); 
                
                switch (letter){ 
                    case 'A': 
                    case 'E': 
                    case 'I': 
                    case 'O': 
                    case 'U': 
                        System.out.println(letter + " is a VOWEL"); 
                        break; 
                    default: 
                        System.out.println(letter + " is a CONSONANT"); 
                } 
            }

            System.out.print("\nWould you like to enter another letter? (yes/no): ");
            answer = scanner.next(); 
            
        } while(answer.equalsIgnoreCase("yes")); 
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
