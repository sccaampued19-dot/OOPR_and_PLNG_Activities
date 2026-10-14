package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class OOP_MIDTERM_Lab_Act_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); 

        String name = "";
        while (name.isEmpty()) {
            System.out.print("Please enter your name: ");
            String input = scanner.nextLine().trim();
            
            if (input.matches("^[a-zA-Z ]+$")) {
                name = input;
            } else {
                System.out.println("Invalid input! Names can only contain letters and spaces. Try again.\n");
            }
        }
        
        System.out.println("\n\tWelcome " + name);

        int page = -1;
        while (page <= 0) {
            System.out.print("\nHow many pages does the book have? ");
            if (scanner.hasNextInt()) {
                page = scanner.nextInt();
                if (page <= 0) {
                    System.out.println("Invalid input! Total pages must be greater than 0. Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid whole number (no text or decimals).");
                scanner.next();
            }
        }

        LocalDate issueDate = null;
        scanner.nextLine(); 
        while (issueDate == null) {
            System.out.print("What is the Issue Date? (MM/dd/yyyy): ");
            String inputIssue = scanner.nextLine().trim();
            try {
                issueDate = LocalDate.parse(inputIssue, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format! Use MM/dd/yyyy (e.g., 10/14/2026).");
            }
        }

        int page_read = -1;
        while (page_read < 0 || page_read > page) {
            System.out.print("\nHow many pages have you read? ");
            if (scanner.hasNextInt()) {
                page_read = scanner.nextInt();
                if (page_read < 0) {
                    System.out.println("Invalid input! Pages read cannot be negative. Try again.");
                } else if (page_read > page) {
                    System.out.println("Invalid input! You cannot read more pages than the book has (" + page + "). Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid whole number (no text or decimals).");
                scanner.next();
            }
        }

        LocalDate dueDate = null;
        scanner.nextLine(); 
        while (dueDate == null) {
            System.out.print("What is the Due Date? (MM/dd/yyyy): ");
            String inputDue = scanner.nextLine().trim();
            try {
                LocalDate tempDate = LocalDate.parse(inputDue, formatter);
                if (tempDate.isBefore(issueDate)) {
                    System.out.println("Error: Due date cannot be earlier than the issue date (" + issueDate.format(formatter) + ")!");
                } else {
                    dueDate = tempDate;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format! Use MM/dd/yyyy (e.g., 10/25/2026).");
            }
        }
        
        String answer = "";
        while (!answer.equals("y") && !answer.equals("yes") && !answer.equals("n") && !answer.equals("no")) {
            System.out.print("\nDo you want to Calculate? (y/n): ");
            answer = scanner.nextLine().trim().toLowerCase();
            if (!answer.equals("y") && !answer.equals("yes") && !answer.equals("n") && !answer.equals("no")) {
                System.out.println("Invalid choice. Please type 'y' or 'n'.");
            }
        }

        if (answer.equals("y") || answer.equals("yes")) {
            double readPercentage = ((double) page_read / page) * 100;
            System.out.printf("\nYou have read %.2f%% of the book.\n", readPercentage);
            
            long actualDaysLeft = ChronoUnit.DAYS.between(today, dueDate);
            if (actualDaysLeft < 0) {
                System.out.println("The book is OVERDUE by " + Math.abs(actualDaysLeft) + " days!");
            } else {
                System.out.println("You have " + actualDaysLeft + " day(s) remaining to return the book.");
            }
            int unreadPages = page - page_read;
            if (actualDaysLeft > 0 && unreadPages > 0) {
                int pagesPerDay = (int) Math.ceil((double) unreadPages / actualDaysLeft);
                System.out.println("You should read " + pagesPerDay + " pages per day to finish on time.");
            } else if (unreadPages == 0) {
                System.out.println("Congratulations! You have already finished the book.");
            } else {
                System.out.println("The deadline has passed or is today! You need to finish the remaining " + unreadPages + " pages immediately.");
            }
        } else {
            System.out.println("Calculation canceled.");
        }
        
        scanner.close();
    }
}
