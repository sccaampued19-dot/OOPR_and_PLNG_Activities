package com.mycompany.ooprproj1; 
import java.util.Scanner; 

public class midterm_lab_activity2_2 { 
    public static void main (String [] args){ 
        Scanner scanner = new Scanner (System.in); 
        String answer; 
        
        do {
            System.out.print("Enter a date (MM DD YYYY): "); 
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int year = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid date! Please enter a valid month (1-12).");
            } else {
                int maxDays = 31;
                
                switch (month) {
                    case 4: case 6: case 9: case 11:
                        maxDays = 30;
                        break;
                    case 2:
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            maxDays = 29;
                        } else {
                            maxDays = 28;
                        }
                        break;
                }

                if (day < 1 || day > maxDays) {
                    System.out.println("Invalid date! This month only has " + maxDays + " days.");
                } else {
                    switch (month){ 
                        case 1:  
                            System.out.print("January"); 
                            break;
                        case 2:  
                            System.out.print("February"); 
                            break;
                        case 3:  
                            System.out.print("March"); 
                            break;
                        case 4:  
                            System.out.print("April"); 
                            break;
                        case 5:  
                            System.out.print("May"); 
                            break;
                        case 6:  
                            System.out.print("June"); 
                            break;
                        case 7:  
                            System.out.print("July"); 
                            break;
                        case 8:  
                            System.out.print("August"); 
                            break;
                        case 9:  
                            System.out.print("September"); 
                            break;
                        case 10: 
                            System.out.print("October"); 
                            break;
                        case 11: 
                            System.out.print("November"); 
                            break;
                        case 12: 
                            System.out.print("December"); 
                            break; 
                    } 
                    System.out.println(" " + day + ", " + year);
                }
            } 

            System.out.print("\nWould you like to enter another date? (yes/no): ");
            answer = scanner.next(); 
            
        } while(answer.equalsIgnoreCase("yes")); 
        
        System.out.println("\nProgram terminated. Goodbye!");
        scanner.close();
    }
}
