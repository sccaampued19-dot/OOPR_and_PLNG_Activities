package com.mycompany.ooprproj1;
import java.util.Scanner;

public class week9_assessment1_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int i = 1; 
        while (i <= 5) {
            System.out.println(name);
            i++;
        }
        
        scanner.close();
    }
}
