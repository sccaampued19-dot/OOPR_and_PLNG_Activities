package com.mycompany.ooprproj1;

import java.util.Scanner;
public class LA121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        
        System.out.println("ARITHMETIC OPERATION");
        String a;
        
        do{
            System.out.println("\nEnter Two Numbers");
            System.out.print(" - Enter 1st Number: ");
            double x = scanner.nextDouble();
            System.out.print(" - Enter 2nd Number: ");
            double y = scanner.nextDouble();
            
            double add = x+y, sub = x-y, mult = x*y, div = x/y, mod = x%y;
            System.out.println("\nAddition: " + x + " + " + y + " = " + add);
            System.out.println("Subtaction: " + x + " - " + y + " = " + sub);
            System.out.println("Multiplication: " + x + " * " + y + " = " + mult);
            System.out.println("Division: " + x + " / " + y + " = " + div);
            System.out.println("Modulus: " + x + " % " + y + " = " + mod);
            System.out.print("Increment: " + x + "++ ");
            double inc = ++x;
            System.out.println("= " + inc);
            System.out.print("Increment: " + x + "-- ");
            double dec = x;
            System.out.println("= " + --dec);
            
            System.out.println("Do you want to enter another?");
            scanner.nextLine();
            a = scanner.nextLine();
        } while (a.equalsIgnoreCase("yes"));
            scanner.close();
        }
        }