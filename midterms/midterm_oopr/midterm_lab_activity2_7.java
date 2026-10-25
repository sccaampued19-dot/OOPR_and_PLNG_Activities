package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_7 {
    private static final String[] ONES = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 1 || number > 3000) {
                System.out.println("Invalid input! Please enter a number between 1 and 3000.");
            } else {
                System.out.println(convertToWords(number));
            }

            System.out.print("\nWould you like to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }

    public static String convertToWords(int num) {
        String result = "";

        if (num >= 1000) {
            result += ONES[num / 1000] + " thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            result += ONES[num / 100] + " hundred ";
            num %= 100;
        }

        if (num > 0) {
            if (num < 20) {
                result += ONES[num];
            } else {
                result += TENS[num / 10];
                if (num % 10 > 0) {
                    result += " " + ONES[num % 10];
                }
            }
        }
        return result.trim();
    }
}
