package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Program_2_Store_Stock_Reorder_Report {
    static Scanner input = new Scanner(System.in);

    static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                int value = input.nextInt();
                if (value >= min && value <= max) return value;
                System.out.println("Invalid input. Enter a value from " + min + " to " + max + ".");
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                input.next(); 
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Notebook", "Pen", "Folder", "USB"};
        int[] stock = new int[4];
        int[] reorder = {5, 10, 5, 2};
        int[] target = {20, 30, 20, 10};

        int totalStock = 0;
        int totalSuggestedOrder = 0;

        for (int i = 0; i < names.length; i++) {
            stock[i] = readInt(names[i] + " stock: ", 0, 10000);
            totalStock += stock[i];
        }
        System.out.println("");
        
        StringBuilder resultLines = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            int suggestedOrder = 0;
            if (stock[i] <= reorder[i]) {
                suggestedOrder = target[i] - stock[i];
                totalSuggestedOrder += suggestedOrder;
            }

            resultLines.append(String.format("%s: stock = %d  |  order = %d%n", names[i], stock[i], suggestedOrder));
        }

        System.out.print(resultLines.toString());
        
        System.out.println("");
        
        System.out.println("Total stock: " + totalStock);
        System.out.println("Total suggested order: " + totalSuggestedOrder);
    }
}
