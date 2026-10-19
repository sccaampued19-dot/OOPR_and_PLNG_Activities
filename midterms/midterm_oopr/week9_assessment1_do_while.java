package com.mycompany.ooprproj1;
import java.util.Scanner;

public class week9_assessment1_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int i = 1;
        do {
            System.out.println(name);
            i++; 
        } while (i <= 5);
        
        scanner.close();
    }
}
