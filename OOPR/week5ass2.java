package com.mycompany.ooprproj1;

import java.util.Scanner;
        
public class week5ass2 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        System.out.println("ENTER 3 NUMBERS\n");
        
        System.out.print(" - Enter First Number: ");
        double num1 = num.nextDouble();
        
        System.out.print(" - Enter Second Number: ");
        double num2 = num.nextDouble();
        
        System.out.print(" - Enter Third Number: ");
        double num3 = num.nextDouble();
        
        System.out.println(" ");
        
        if (num1 > num2 && num1 > num3){
            System.out.println("The Highest Number is: " + num1);
        } if (num2 > num1 && num2 > num3){
            System.out.println("The Highest Number is: " + num2);
        } if (num3 > num1 && num3 > num2){
            System.out.println("The Highest Number is: " + num3);
        }
         
    }
    
}
