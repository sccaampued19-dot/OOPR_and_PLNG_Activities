package com.mycompany.ooprproj1;

import java.util.Scanner;

public class Week7_Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- VOWEL or CONSONANT ---");
        
        while (true) {
            System.out.print("\nEnter a letter: ");
            String input = scanner.next(); 

            char ch = Character.toLowerCase(input.charAt(0));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("It's a vowel!");
                } else {
                    System.out.println("It's a consonant!");
                }
            } else {
                System.out.println("Invalid input! Please enter a letter from A-Z.");
            }

            System.out.print("\nWould you like to enter another letter: ");
            scanner.nextLine(); 
            String answer = scanner.nextLine();
            
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }
}
