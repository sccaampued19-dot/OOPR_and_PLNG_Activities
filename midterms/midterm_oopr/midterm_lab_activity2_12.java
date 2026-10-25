package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_12 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String answer;
        
        do{
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            
            int i = 1;
            int j = num;
            
            System.out.println("\nMAIN MENU");
            System.out.println("[1] For Loop");
            System.out.println("[2] While Loop");
            System.out.println("[3] Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            
            switch (loop){
                case 1:
                    for (; i <= num; i++, j--){
                        System.out.print(i + ", " + j + ", ");
                    }
                    break;
                case 2:
                    while (i <= num){
                        System.out.print(i + ", " + j + ", ");
                        i++;
                        j--;
                    }
                    break;
                case 3:
                    do {
                        System.out.print(i + ", " + j + ", ");
                        i++;
                        j--;
                    } while (i <= num);
                    break;
                default:
                    System.out.println("\nInvalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
            
        }while(answer.equalsIgnoreCase("yes"));
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
