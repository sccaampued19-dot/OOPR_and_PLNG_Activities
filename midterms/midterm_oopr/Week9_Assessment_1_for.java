package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Week9_Assessment_1_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}

