package com.mycompany.ooprproj1;
import java.util.Scanner;

public class midterm_lab_activity2_9 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String answer;
        
        do {
            System.out.print("Enter tuition fee: ");
            double tf = scanner.nextDouble();
            
            System.out.println("\n MAIN MENU");
            System.out.println("[1] Cash");
            System.out.println("[2] Two-installments");
            System.out.println("[3] Three-installments");
            System.out.print("Enter mode of payment: ");
            int mode = scanner.nextInt();
            
            switch (mode){
                case 1:
                    double cash_disc = tf * 0.10;
                    double new_tf_cash = tf - cash_disc;
                    System.out.println("\nYour total tuition fee is: " + new_tf_cash);
                    break; 
                    
                case 2:
                    double two_interest = tf * 0.05;
                    double new_tf_two = tf + two_interest; 
                    System.out.println("\nYour total tuition fee is: " + new_tf_two);
                    break; 
                    
                case 3:
                    double three_disc = tf * 0.10;
                    double new_tf_three = tf + three_disc;
                    System.out.println("\nYour total tuition fee is: " + new_tf_three);
                    break; 
                    
                default: 
                    System.out.println("\nInvalid mode of payment!");
                    break;
            }
            
            System.out.print("\nDo you want to enter another transaction? (yes/no): ");
            answer = scanner.next();
            
        } while(answer.equalsIgnoreCase("yes"));
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
