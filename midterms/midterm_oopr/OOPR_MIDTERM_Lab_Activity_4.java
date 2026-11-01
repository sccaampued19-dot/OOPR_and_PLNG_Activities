package com.mycompany.ooprproj1;

import java.util.Scanner;

public class OOPR_MIDTERM_Lab_Activity_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==========================================================================");
            System.out.println("                     MIDTERM LAB ACTIVITY 4                    ");
            System.out.println("==========================================================================");
            System.out.println(" [1] Programming 18: Smart Payslip Generator (Single Employee)");
            System.out.println(" [2] Programming 19: Student Information & Tuition Fee Billing System");
            System.out.println(" [3] Programming 20: Customer Purchase Order with Receipt System");
            System.out.println(" [4] Programming 21: Simple Ticketing System (Plain Ticket)");
            System.out.println(" [5] Programming 22: Simple Reservation and Billing System");
            System.out.println(" [6] Programming 23: Simple CRS - Car Rental System");
            System.out.println(" [7] Programming 24: Simple ROS - Restaurant Ordering System");
            System.out.println(" [8] Programming 25: Simple Flower Reservation with Billing System");
            System.out.println(" [9] Programming 26: KMART Korean Noodles Purchase Order with Billing System");
            System.out.println("[10] Programming 27: Car and Motor Parking Reservation & Billing System");
            System.out.println(" [0] Exit");
            System.out.println("==========================================================================");
            int choice = readInt(scanner, "Select a program tracking profile (0-10): ");

            switch (choice) {
                case 1:  
                    runProg18(scanner); 
                    break;
                case 2:  
                    runProg19(scanner); 
                    break;
                case 3:  
                    runProg20(scanner); 
                    break;
                case 4:  
                    runProg21(scanner); 
                    break;
                case 5:  
                    runProg22(scanner); 
                    break;
                case 6:  
                    runProg23(scanner); 
                    break;
                case 7:  
                    runProg24(scanner); 
                    break;
                case 8:  
                    runProg25(scanner); 
                    break;
                case 9:  
                    runProg26(scanner); 
                    break;
                case 10: 
                    runProg27(scanner); 
                    break;
                case 0:
                    System.out.println("\nExiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\nChoose values from (0-10).");
            }
        }
        scanner.close();
    }

    private static String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = scanner.nextInt();
                scanner.nextLine(); 
                return value;
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid whole number value.");
                scanner.nextLine();
            }
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = scanner.nextDouble();
                scanner.nextLine(); 
                return value;
            } catch (Exception e) {
                System.out.println("Error: Invalid numeric formatting notation. Re-enter.");
                scanner.nextLine();
            }
        }
    }

    private static void runProg18(Scanner scanner) {
        System.out.println("\n--- Programming 18 Workspace Loaded ---");
        String name = readString(scanner, "Employee Name: ");
        String id = readString(scanner, "Employee ID: ");
        String dept = readString(scanner, "Department: ");
        double baseSalary = readDouble(scanner, "Basic Monthly Salary: ");
        
        String startDate = readString(scanner, "Payroll Start Date (YYYY-MM-DD): ");
        String endDate = readString(scanner, "Payroll End Date (YYYY-MM-DD): ");
        String payoutDate = readString(scanner, "Payout Date (YYYY-MM-DD): ");
        
        double regHours = readDouble(scanner, "Total Regular Hours Worked: ");
        double otHours = readDouble(scanner, "Overtime Hours Worked: ");
        int absentDays = readInt(scanner, "Number of Absent Days: ");
        
        double rice = readDouble(scanner, "Rice Allowance: ");
        double trans = readDouble(scanner, "Transportation Allowance: ");
        double comms = readDouble(scanner, "Communication Allowance: ");
        
        double sss = readDouble(scanner, "SSS Contribution: ");
        double ph = readDouble(scanner, "PhilHealth Contribution: ");
        double pagibig = readDouble(scanner, "PAG-IBIG Contribution: ");
        double tax = readDouble(scanner, "Withholding Tax: ");
        double otherDed = readDouble(scanner, "Other Deductions: ");

        double hourlyRate = baseSalary / 160.0;
        double dailyRate = baseSalary / 20.0;
        double regularPay = regHours * hourlyRate;
        double otPay = otHours * (hourlyRate * 1.25);
        double absenceDeduction = absentDays * dailyRate;
        double totalAllowances = rice + trans + comms;
        double grossPay = regularPay + otPay + totalAllowances;
        double totalDeductions = sss + ph + pagibig + tax + otherDed + absenceDeduction;
        double netPay = grossPay - totalDeductions;

        System.out.println("\n*** Smart Employee Payslip ***");
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("\nPayroll Summary");
        System.out.println("Pay Period: " + startDate + " to " + endDate);
        System.out.println("Payout Date: " + payoutDate);
        System.out.println("\nEarnings");
        System.out.printf("Regular Pay: %.2f\n", regularPay);
        System.out.printf("Overtime Pay: %.2f\n", otPay);
        System.out.printf("Total Allowances: %.2f\n", totalAllowances);
        System.out.printf("Gross Pay: %.2f\n", grossPay);
        System.out.println("\nAllowances Breakdown");
        System.out.printf("Rice Allowance: %.2f\n", rice);
        System.out.printf("Transportation Allowance: %.2f\n", trans);
        System.out.printf("Communication Allowance: %.2f\n", comms);
        System.out.println("\nDeductions");
        System.out.printf("SSS: %.2f\n", sss);
        System.out.printf("PhilHealth: %.2f\n", ph);
        System.out.printf("PAG-IBIG: %.2f\n", pagibig);
        System.out.printf("Withholding Tax: %.2f\n", tax);
        System.out.printf("Absence Deduction: %.2f\n", absenceDeduction);
        System.out.printf("Other Deductions: %.2f\n", otherDed);
        System.out.printf("Total Deductions: %.2f\n", totalDeductions);
        System.out.printf("\nNet Pay: %.2f\n", netPay);
    }

    private static void runProg19(Scanner scanner) {
        System.out.println("\n--- Programming 19 Workspace Loaded ---");
        String name = readString(scanner, "Student Name: ");
        String id = readString(scanner, "Student ID: ");
        String course = readString(scanner, "Course/Program: ");
        int yearLevel = readInt(scanner, "Year Level: ");
        
        int units = readInt(scanner, "Number of Units Enrolled: ");
        double feePerUnit = readDouble(scanner, "Tuition Fee per Unit: ");
        double misc = readDouble(scanner, "Miscellaneous Fee: ");
        
        double labFee = readDouble(scanner, "Laboratory Fee: ");
        double libFee = readDouble(scanner, "Library Fee: ");
        double otherFees = readDouble(scanner, "Other Fees: ");
        
        double downPayment = readDouble(scanner, "Down Payment: ");
        double scholarshipDisc = readDouble(scanner, "Scholarship Discount: ");

        double tuitionTotal = units * feePerUnit;
        double addFeesTotal = labFee + libFee + otherFees;
        double grossTotal = tuitionTotal + misc + addFeesTotal;
        double netTotal = grossTotal - scholarshipDisc;
        double balance = netTotal - downPayment;

        System.out.println("\n*** STUDENT TUITION BILLING SYSTEM ***");
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("\nEnrollment Summary");
        System.out.println("Units Enrolled: " + units);
        System.out.printf("Tuition per Unit: %.2f\n", feePerUnit);
        System.out.printf("Tuition Fee Total: %.2f\n", tuitionTotal);
        System.out.println("\nFees Breakdown");
        System.out.printf("Miscellaneous Fee: %.2f\n", misc);
        System.out.printf("Laboratory Fee: %.2f\n", labFee);
        System.out.printf("Library Fee: %.2f\n", libFee);
        System.out.printf("Other Fees: %.2f\n", otherFees);
        System.out.printf("Gross Total Fee: %.2f\n", grossTotal);
        System.out.println("\nPayment Summary");
        System.out.printf("Scholarship Discount: %.2f\n", scholarshipDisc);
        System.out.printf("Net Total Fee: %.2f\n", netTotal);
        System.out.printf("Down Payment: %.2f\n", downPayment);
        System.out.printf("Remaining Balance: %.2f\n", balance);
    }

    private static void runProg20(Scanner scanner) {
        System.out.println("\n--- Programming 20 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        
        String[] itemNames = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];
        double[] itemTotals = new double[3];
        double subtotal = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Item " + (i + 1) + ":");
            itemNames[i] = readString(scanner, "   Item Name: ");
            quantities[i] = readInt(scanner, "   Quantity: ");
            prices[i] = readDouble(scanner, "   Price per Item: ");
            itemTotals[i] = quantities[i] * prices[i];
            subtotal += itemTotals[i];
        }
        
        double discPercent = readDouble(scanner, "Discount (%): ");
        double tendered = readDouble(scanner, "Amount Tendered by Customer: ");

        double discAmount = subtotal * (discPercent / 100.0);
        double due = subtotal - discAmount;
        double change = tendered - due;

        System.out.println("\n******** CUSTOMER RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("\nPurchased Items");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item Name", "Quantity", "Price", "Total");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", itemNames[i], quantities[i], prices[i], itemTotals[i]);
        }
        
        System.out.println("\nPayment Summary");
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Discount (%%): %.1f%%\n", discPercent);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Amount Due: %.2f\n", due);
        System.out.printf("Amount Tendered: %.2f\n", tendered);
        System.out.printf("Change: %.2f\n", change);
    }

    private static void runProg21(Scanner scanner) {
        System.out.println("\n--- Programming 21 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        String event = readString(scanner, "Event Name: ");
        String type = readString(scanner, "Ticket Type: ");
        double price = readDouble(scanner, "Ticket Price: ");
        int qty = readInt(scanner, "Number of Tickets: ");
        double discount = readDouble(scanner, "Discount (%): ");
        double tendered = readDouble(scanner, "Amount Tendered: ");
    
        double totalCost = price * qty;
        double discAmount = totalCost * (discount / 100.0);
        double finalDue = totalCost - discAmount;
        double change = tendered - finalDue;

        System.out.println("\n******** EVENT TICKET ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("\nTicket Information");
        System.out.println("Event Name: " + event);
        System.out.println("Ticket Type: " + type);
        System.out.printf("Ticket Price: %.2f\n", price);
        System.out.println("Number of Tickets: " + qty);
        System.out.printf("Total Ticket Cost: %.2f\n", totalCost);
        System.out.println("\nPayment Summary");
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Final Amount Due: %.2f\n", finalDue);
        System.out.printf("Amount Tendered: %.2f\n", tendered);
        System.out.printf("Change: %.2f\n", change);
    }

    private static void runProg22(Scanner scanner) {
        System.out.println("\n--- Programming 22 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        String resType = readString(scanner, "Reservation Type: ");
        double duration = readDouble(scanner, "Number of Days / Hours Reserved: ");
        double rate = readDouble(scanner, "Rate per Day / Hour: ");
        double food = readDouble(scanner, "Food Charges: ");
        double service = readDouble(scanner, "Service Charges: ");
        double other = readDouble(scanner, "Other Charges: ");
        double discount = readDouble(scanner, "Discount (%): ");
        double downPayment = readDouble(scanner, "Down Payment: ");
       
        double resCost = duration * rate;
        double addCharges = food + service + other;
        double subtotal = resCost + addCharges;
        double discAmount = subtotal * (discount / 100.0);
        double totalBill = subtotal - discAmount;
        double balance = totalBill - downPayment;
        
        System.out.println("\n******** RESERVATION BILLING ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("\nReservation Details");
        System.out.println("Reservation Type: " + resType);
        System.out.println("Duration: " + duration);
        System.out.printf("Rate: %.2f\n", rate);
        System.out.printf("Reservation Cost: %.2f\n", resCost);
        System.out.println("\nCharges Breakdown");
        System.out.printf("Food Charges: %.2f\n", food);
        System.out.printf("Service Charges: %.2f\n", service);
        System.out.printf("Other Charges: %.2f\n", other);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Bill: %.2f\n", totalBill);
        System.out.printf("Down Payment: %.2f\n", downPayment);
        System.out.printf("Remaining Balance: %.2f\n", balance);
    }

    private static void runProg23(Scanner scanner) {
        System.out.println("\n--- Programming 23 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        String license = readString(scanner, "Driver's License Number: ");
        String vehicleType = readString(scanner, "Vehicle Type: ");
        String model = readString(scanner, "Vehicle Model: ");
        double ratePerDay = readDouble(scanner, "Rental Rate per Day: ");
        int days = readInt(scanner, "Number of Rental Days: ");
        String pickup = readString(scanner, "Pickup Date (YYYY-MM-DD): ");
        String returnDate = readString(scanner, "Return Date (YYYY-MM-DD): ");
        double insurance = readDouble(scanner, "Insurance Fee: ");
        double fuel = readDouble(scanner, "Fuel Charge: ");
        double other = readDouble(scanner, "Other Charges: ");
        double discount = readDouble(scanner, "Discount (%): ");
        double paid = readDouble(scanner, "Amount Paid: ");
    
        double rentalCost = ratePerDay * days;
        double addCharges = insurance + fuel + other;
        double subtotal = rentalCost + addCharges;
        double discAmount = subtotal * (discount / 100.0);
        double totalDue = subtotal - discAmount;

        System.out.println("\n******** CAR RENTAL RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("License: " + license);
        System.out.println("\nVehicle Information");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Model: " + model);
        System.out.printf("Rate per Day: %.2f\n", ratePerDay);
        System.out.println("\nRental Summary");
        System.out.println("Pickup Date: " + pickup);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Number of Days: " + days);
        System.out.printf("Rental Cost: %.2f\n", rentalCost);
        System.out.println("\nCharges Breakdown");
        System.out.printf("Insurance Fee: %.2f\n", insurance);
        System.out.printf("Fuel Charge: %.2f\n", fuel);
        System.out.printf("Other Charges: %.2f\n", other);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Amount Due: %.2f\n", totalDue);
        System.out.printf("Amount Paid: %.2f\n", paid);
        
        if (paid >= totalDue) {
            System.out.printf("Change: %.2f\n", (paid - totalDue));
        } else {
            System.out.printf("Remaining Balance: %.2f\n", (totalDue - paid));
        }
    }

    private static void runProg24(Scanner scanner) {
        System.out.println("\n--- Programming 24 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String orderType = readString(scanner, "Order Type (Dine-In or Takeout): ");
        
        String[] itemNames = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];
        double[] itemTotals = new double[3];
        
        double subtotal = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Item " + (i + 1) + ":");
            itemNames[i] = readString(scanner, "   Item Name: ");
            quantities[i] = readInt(scanner, "   Quantity: ");
            prices[i] = readDouble(scanner, "   Price per Item: ");
            
            itemTotals[i] = quantities[i] * prices[i];
            subtotal += itemTotals[i];
        }
        
        double serviceCharge = 0;
        double packagingFee = 0;
        
        if (orderType.equalsIgnoreCase("Dine-In")) {
            serviceCharge = readDouble(scanner, "Service Charge: ");
        } else {
            packagingFee = readDouble(scanner, "Packaging Fee: ");
        }
        
        double discount = readDouble(scanner, "Discount (%): ");
        double tendered = readDouble(scanner, "Amount Tendered: ");

        double appCharges = orderType.equalsIgnoreCase("Dine-In") ? serviceCharge : packagingFee;
        double totalBeforeDisc = subtotal + appCharges;
        double discAmount = totalBeforeDisc * (discount / 100.0);
        double due = totalBeforeDisc - discAmount;
        double change = tendered - due;

        System.out.println("\n******** RESTAURANT RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Order Type: " + orderType);
        System.out.println("\nOrder Summary");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item Name", "Quantity", "Price", "Total");
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", itemNames[i], quantities[i], prices[i], itemTotals[i]);
        }
        
        System.out.println("\nBilling Summary");
        System.out.printf("Subtotal: %.2f\n", subtotal);
        
        if (orderType.equalsIgnoreCase("Dine-In")) {
            System.out.printf("Service Charge: %.2f\n", serviceCharge);
        } else {
            System.out.printf("Packaging Fee: %.2f\n", packagingFee);
        }
        
        System.out.printf("Total Before Discount: %.2f\n", totalBeforeDisc);
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Amount Due: %.2f\n", due);
        System.out.printf("Amount Tendered: %.2f\n", tendered);
        System.out.printf("Change: %.2f\n", change);
    }

    private static void runProg25(Scanner scanner) {
        System.out.println("\n--- Programming 25 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        String contact = readString(scanner, "Contact Number: ");
        String flowerType = readString(scanner, "Flower Type: ");
        String arrType = readString(scanner, "Arrangement Type: ");
        
        double rate = readDouble(scanner, "Price per Arrangement: ");
        int qty = readInt(scanner, "Quantity: ");
        
        String resDate = readString(scanner, "Reservation Date (YYYY-MM-DD): ");
        String targetDate = readString(scanner, "Pickup/Delivery Date (YYYY-MM-DD): ");
        
        double delivery = readDouble(scanner, "Delivery Fee: ");
        double customFee = readDouble(scanner, "Customization Fee: ");
        double other = readDouble(scanner, "Other Charges: ");
        double discount = readDouble(scanner, "Discount (%): ");
        double downPayment = readDouble(scanner, "Down Payment: ");

        double resCost = rate * qty;
        double totalAdd = delivery + customFee + other;
        double subtotal = resCost + totalAdd;
        double discAmount = subtotal * (discount / 100.0);
        double totalBill = subtotal - discAmount;
        double balance = totalBill - downPayment;

        System.out.println("\n******** FLOWER RESERVATION RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Contact Number: " + contact);
        System.out.println("\nReservation Summary");
        System.out.println("Flower Type: " + flowerType);
        System.out.println("Arrangement Type: " + arrType);
        System.out.println("Quantity: " + qty);
        System.out.printf("Price per Arrangement: %.2f\n", rate);
        System.out.printf("Reservation Cost: %.2f\n", resCost);
        System.out.println("Reservation Date: " + resDate);
        System.out.println("Pickup/Delivery Date: " + targetDate);
        System.out.println("\nCharges Breakdown");
        System.out.printf("Delivery Fee: %.2f\n", delivery);
        System.out.printf("Customization Fee: %.2f\n", customFee);
        System.out.printf("Other Charges: %.2f\n", other);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Bill: %.2f\n", totalBill);
        System.out.printf("Down Payment: %.2f\n", downPayment);
        System.out.printf("Remaining Balance: %.2f\n", balance);
    }

    private static void runProg26(Scanner scanner) {
        System.out.println("\n--- Programming 26 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        String contact = readString(scanner, "Contact Number: ");
        String product = readString(scanner, "Product Name: ");
        String brand = readString(scanner, "Brand: ");
        
        double price = readDouble(scanner, "Price per Pack: ");
        int qty = readInt(scanner, "Quantity: ");
        double packaging = readDouble(scanner, "Packaging Fee: ");
        double delivery = readDouble(scanner, "Delivery Fee: ");
        double discount = readDouble(scanner, "Discount (%): ");
        double cash = readDouble(scanner, "Cash Payment: ");

        double prodCost = price * qty;
        double subtotal = prodCost + packaging + delivery;
        double discAmount = subtotal * (discount / 100.0);
        double totalBill = subtotal - discAmount;

        System.out.println("\n******** KMART PURCHASE RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Contact Number: " + contact);
        System.out.println("\nOrder Summary");
        System.out.println("Product Name: " + product);
        System.out.println("Brand: " + brand);
        System.out.printf("Price per Pack: %.2f\n", price);
        System.out.println("Quantity: " + qty);
        System.out.printf("Total Product Cost: %.2f\n", prodCost);
        System.out.println("\nCharges");
        System.out.printf("Packaging Fee: %.2f\n", packaging);
        System.out.printf("Delivery Fee: %.2f\n", delivery);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Bill: %.2f\n", totalBill);
        System.out.printf("Cash Payment: %.2f\n", cash);
        
        if (cash >= totalBill) {
            System.out.printf("Change: %.2f\n", (cash - totalBill));
        } else {
            System.out.printf("Remaining Balance: %.2f\n", (totalBill - cash));
        }
    }

    private static void runProg27(Scanner scanner) {
        System.out.println("\n--- Programming 27 Workspace Loaded ---");
        String name = readString(scanner, "Customer Name: ");
        String id = readString(scanner, "Customer ID: ");
        String contact = readString(scanner, "Contact Number: ");
        String vehicleType = readString(scanner, "Vehicle Type (Car or Motorcycle): ");
        
        String plate = readString(scanner, "Plate Number: ");
        
        String entryTime = readString(scanner, "Entry Time (HH:MM): ");
        String exitTime = readString(scanner, "Exit Time (HH:MM): ");
        
        double hourlyRate = readDouble(scanner, "Hourly Rate: ");
        double resFee = readDouble(scanner, "Reservation Fee: ");
        double overnight = readDouble(scanner, "Overnight Fee: ");
        double penalty = readDouble(scanner, "Penalty Fee: ");
        double discount = readDouble(scanner, "Discount (%): ");
        double cash = readDouble(scanner, "Cash Payment: ");
   
        double totalHours = calculateHours(entryTime, exitTime);
        double parkingFee = totalHours * hourlyRate;
        double subtotal = parkingFee + resFee + overnight + penalty;
        double discAmount = subtotal * (discount / 100.0);
        double totalBill = subtotal - discAmount;
    
        System.out.println("\n******** PARKING RECEIPT ********");
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Contact Number: " + contact);
        System.out.println("\nVehicle Details");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Plate Number: " + plate);
        System.out.println("\nParking Summary");
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.printf("Total Hours: %.2f\n", totalHours);
        System.out.printf("Hourly Rate: %.2f\n", hourlyRate);
        System.out.printf("Parking Fee: %.2f\n", parkingFee);
        System.out.println("\nCharges Breakdown");
        System.out.printf("Reservation Fee: %.2f\n", resFee);
        System.out.printf("Overnight Fee: %.2f\n", overnight);
        System.out.printf("Penalty Fee: %.2f\n", penalty);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("Discount (%%): %.1f%%\n", discount);
        System.out.printf("Discount Amount: %.2f\n", discAmount);
        System.out.printf("Total Bill: %.2f\n", totalBill);
        System.out.printf("Cash Payment: %.2f\n", cash);
        
        if (cash >= totalBill) {
            System.out.printf("Change: %.2f\n", (cash - totalBill));
        } else {
            System.out.printf("Remaining Balance: %.2f\n", (totalBill - cash));
        }
    }

    private static double calculateHours(String entry, String exit) {
        try {
            String[] entryParts = entry.split(":");
            String[] exitParts = exit.split(":");
            
            int entryMins = (Integer.parseInt(entryParts[0]) * 60) + Integer.parseInt(entryParts[1]);
            int exitMins = (Integer.parseInt(exitParts[0]) * 60) + Integer.parseInt(exitParts[1]);

            if (exitMins < entryMins) {
                exitMins += 24 * 60;
            }
            
            return (exitMins - entryMins) / 60.0;
        } catch (Exception e) {
            return 0.0; 
        }
    }
}