package com.mycompany.ooprproj1;
import java.util.Scanner;

public class Week_9_Assessment_No_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        
        do {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.println("\nMAIN MENU");
            System.out.println("[1] For Loop");
            System.out.println("[2] While Loop");
            System.out.println("[3] Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            
            int i = 1;
            
            switch (loop){
                case 1:
                    for (; i <= 5; i++){
                        System.out.println(name);
                    }
                    break;
                case 2:
                    while (i <= 5){
                        System.out.println(name);
                        i++;
                    }
                    break;
                case 3:
                    do {
                        System.out.println(name);
                        i++; 
                    } while (i <= 5);  
                    break;
                default:
                    System.out.println("Invalid Selection.");
            }
            
            System.out.print("\nDo you want to enter another name? (yes/no): ");
            answer = scanner.next();
            
            scanner.nextLine();
            
        } while (answer.equalsIgnoreCase("yes"));
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
        
    }
}