package com.mycompany.ooprproj1;
import java.util.Scanner;

public class week9_assessment1_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}
