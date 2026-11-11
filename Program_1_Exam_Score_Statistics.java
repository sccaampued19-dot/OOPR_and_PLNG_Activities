package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Program_1_Exam_Score_Statistics {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int numStudents = 0;

        while (true) {
            System.out.print("Enter the total number of students: ");
            if (scanner.hasNextInt()) {
                numStudents = scanner.nextInt();
                if (numStudents >= 1) {
                    break;
                } else {
                    System.out.println("Invalid class size. Must be at least 1 student.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); 
            }
        }

        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter score for Student #" + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i] = score;
                        break;
                    } else {
                        System.out.println("Invalid score! Rejecting " + score + ". Please request another value between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a whole number.");
                    scanner.next();
                }
            }
        }

        int totalSum = 0;
        int highestScore = scores[0]; 
        int lowestScore = scores[0];
        int passingCount = 0;
        int failingCount = 0;

        for (int i = 0; i < numStudents; i++) {
            int currentScore = scores[i];
            totalSum += currentScore;

            if (currentScore > highestScore) {
                highestScore = currentScore;
            }
            if (currentScore < lowestScore) {
                lowestScore = currentScore;
            }

            if (currentScore >= 75) {
                passingCount++;
            } else {
                failingCount++;
            }
        }

        double average = (double) totalSum / numStudents;

        System.out.println("\nExam Summary:");
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score:  " + lowestScore);
        System.out.println("Passing Scores: " + passingCount);
        System.out.println("Failing Scores:  " + failingCount);

        System.out.print("Student(s) with the highest score: ");
        boolean first = true;
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] == highestScore) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print("#" + (i + 1));
                first = false;
            }
        }
        System.out.println();

        scanner.close();
    }
}
