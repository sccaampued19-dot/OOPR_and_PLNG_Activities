package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 1 || number > 3000) {
                System.out.println("Invalid input! Please enter a number between 1 and 3000.");
            } else {
                int tempNumber = number;
                StringBuilder roman = new StringBuilder();

                for (int i = 0; i < values.length; i++) {
                    while (tempNumber >= values[i]) {
                        roman.append(romanLetters[i]); 
                        tempNumber -= values[i];      
                    }
                }

                System.out.println(roman.toString());
            }

            System.out.print("\nWould you like to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
