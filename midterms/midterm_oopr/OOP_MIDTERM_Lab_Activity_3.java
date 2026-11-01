package com.mycompany.ooprproj1;

import java.util.Scanner;

public class OOP_MIDTERM_Lab_Activity_2 {

    private static final String[] ONES = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n======================================================================");
            System.out.println("                     MIDTERM LAB ACTIVITIES MENU                      ");
            System.out.println("======================================================================");
            System.out.println(" Act 1  - Vowel/Consonant Classifier");
            System.out.println(" Act 2  - Calendar Date Formatter");
            System.out.println(" Act 3  - H2O Thermal State Identifier");
            System.out.println(" Act 4  - Aircraft Airframe Classifier");
            System.out.println(" Act 5  - Naval Hull Designation Lookup");
            System.out.println(" Act 6  - Richter Scale Severity Assesser");
            System.out.println(" Act 7  - Integer text-Word Transmuter");
            System.out.println(" Act 8  - Roman Numeral Notation Encoder");
            System.out.println(" Act 9  - Tuition Account Surcharge Processor");
            System.out.println(" Act 10 - Scholastic Grade Value Transmuter");
            System.out.println(" Act 11 - Linear Square Computation Grid");
            System.out.println(" Act 12 - Dual Symmetric Up/Down Sequence");
            System.out.println(" Act 13 - Dual Symmetric Down/Up Sequence");
            System.out.println(" Act 14 - Factorial Factorial Accumulator");
            System.out.println(" Act 15 - Golden Ratio Fibonacci Sequence");
            System.out.println(" Act 16 - Radical Exponentiation Machine");
            System.out.println(" Act 17 - Incremental Sum of Squares Series");
            System.out.println(" Act 18 - Progressive Sigma Loop Accumulator");
            System.out.println(" Act 19 - Integer Base-10 Radical Reverser");
            System.out.println(" Act 20 - Accumulative Self-Power (n^n) Grid");
            System.out.println(" Act 21 - Linear Right Triangle Symbol Array");
            System.out.println(" Act 22 - Chess Binary Alternating Matrix");
            System.out.println(" Act 23 - Centered Equilateral Symbol Pyramid");
            System.out.println(" Act 24 - Tiered Row-Constant Number Matrix");
            System.out.println(" Act 25 - Isolated Spaced Symbol Pyramid");
            System.out.println(" Act 26 - Progressive Spaced Number Pyramid");
            System.out.println(" Act 27 - Floods Progressive Integer Triangle");
            System.out.println(" Act 28 - Linear Row-Constant Integer Matrix");
            System.out.println(" Act 29 - Indexed Sequential Integer Triangle");
            System.out.println(" Act 30 - Mirror Inverted Composite Diamond");
            System.out.println(" Act 31 - Palindromic Number Pyramid Matrix");
            System.out.println(" 0 - Exit");
            System.out.println("======================================================================");
            System.out.print("Enter your designated program number (0-31): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:  runActivity1(scanner);  break;
                case 2:  runActivity2(scanner);  break;
                case 3:  runActivity3(scanner);  break;
                case 4:  runActivity4(scanner);  break;
                case 5:  runActivity5(scanner);  break;
                case 6:  runActivity6(scanner);  break;
                case 7:  runActivity7(scanner);  break;
                case 8:  runActivity8(scanner);  break;
                case 9:  runActivity9(scanner);  break;
                case 10: runActivity10(scanner); break;
                case 11: runActivity11(scanner); break;
                case 12: runActivity12(scanner); break;
                case 13: runActivity13(scanner); break;
                case 14: runActivity14(scanner); break;
                case 15: runActivity15(scanner); break;
                case 16: runActivity16(scanner); break;
                case 17: runActivity17(scanner); break;
                case 18: runActivity18(scanner); break;
                case 19: runActivity19(scanner); break;
                case 20: runActivity20(scanner); break;
                case 21: runActivity21(scanner); break;
                case 22: runActivity22(scanner); break;
                case 23: runActivity23(scanner); break;
                case 24: runActivity24(scanner); break;
                case 25: runActivity25(scanner); break;
                case 26: runActivity26(scanner); break;
                case 27: runActivity27(scanner); break;
                case 28: runActivity28(scanner); break;
                case 29: runActivity29(scanner); break;
                case 30: runActivity30(scanner); break;
                case 31: runActivity31(scanner); break;
                case 0:
                    System.out.println("\nTerminating ...");
                    running = false;
                    break;
                default:
                    System.out.println("\nOut of bounds index error! Please choose from (0-31).");
            }
        }
        scanner.close();
    }

    public static void runActivity1(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter a letter: ");
            String input = scanner.next();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input! Please enter only one letter.");
            } else {
                char letter = input.toUpperCase().charAt(0);
                switch (letter) {
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        System.out.println(letter + " is a VOWEL");
                        break;
                    default:
                        System.out.println(letter + " is a CONSONANT");
                }
            }
            System.out.print("\nWould you like to enter another letter? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity2(Scanner scanner) {
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
                    switch (month) {
                        case 1:  System.out.print("January"); break;
                        case 2:  System.out.print("February"); break;
                        case 3:  System.out.print("March"); break;
                        case 4:  System.out.print("April"); break;
                        case 5:  System.out.print("May"); break;
                        case 6:  System.out.print("June"); break;
                        case 7:  System.out.print("July"); break;
                        case 8:  System.out.print("August"); break;
                        case 9:  System.out.print("September"); break;
                        case 10: System.out.print("October"); break;
                        case 11: System.out.print("November"); break;
                        case 12: System.out.print("December"); break;
                    }
                    System.out.println(" " + day + ", " + year);
                }
            }
            System.out.print("\nWould you like to enter another date? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity3(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter a temperature: ");
            double temp = scanner.nextDouble();

            if (temp < 0) {
                System.out.println("ICE");
            } else if (temp >= 0 && temp <= 100) {
                System.out.println("WATER");
            } else if (temp > 100) {
                System.out.println("STEAM");
            }
            System.out.print("\nWould you like to enter another temperature? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity4(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter speed (km/h): ");
            int speed = scanner.nextInt();
            System.out.print("Enter length (meters): ");
            int length = scanner.nextInt();
            if (speed > 1100 && length > 52) {
                System.out.println("CIVILIAN");
            } else if (speed <= 1100 && speed > 500 && length <= 52) {
                System.out.println("MILITARY");
            } else if (speed <= 500) {
                System.out.println("It's a bird");
            } else {
                System.out.println("Unknown Target");
            }
            System.out.print("\nWould you like to enter another aircraft? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity5(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter the Class ID: ");
            String input = scanner.next();
            char letter = input.toUpperCase().charAt(0);
            switch (letter) {
                case 'B': System.out.println("Battleship"); break;
                case 'C': System.out.println("Cruiser"); break;
                case 'D': System.out.println("Destroyer"); break;
                case 'F': System.out.println("Frigate"); break;
                default:  System.out.println("Please choose only from B, C, D, F");
            }
            System.out.print("\nWould you like to enter another letter? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity6(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter a number from the richter scale: ");
            double richter = scanner.nextDouble();
            if (richter < 5.0) {
                System.out.println("little or no damage");
            } else if (richter >= 5.0 && richter < 5.5) {
                System.out.println("some damage");
            } else if (richter >= 5.5 && richter < 6.5) {
                System.out.println("serious damage");
            } else if (richter >= 6.5 && richter < 7.5) {
                System.out.println("disaster");
            } else {
                System.out.println("catastrophe");
            }
            System.out.print("\nWould you like to enter another number from the richter scale? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity7(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 1 || number > 3000) {
                System.out.println("Invalid input! Please enter a number between 1 and 3000.");
            } else {
                System.out.println(convertToWords(number));
            }
            System.out.print("\nWould you like to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }
    private static String convertToWords(int num) {
        String result = "";
        if (num >= 1000) {
            result += ONES[num / 1000] + " thousand ";
            num %= 1000;
        }
        if (num >= 100) {
            result += ONES[num / 100] + " hundred ";
            num %= 100;
        }
        if (num > 0) {
            if (num < 20) {
                result += ONES[num];
            } else {
                result += TENS[num / 10];
                if (num % 10 > 0) {
                    result += " " + ONES[num % 10];
                }
            }
        }
        return result.trim();
    }

    public static void runActivity8(Scanner scanner) {
        String answer;
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 1 || number > 3000) {
                System.out.println("Invalid input! Please enter a number between 1 and 3000.");
            } else {
                int tempNumber = number;
                StringBuilder roman = new StringBuilder();
                for (int i = 0; i < values.length; i++) {
                    while (tempNumber >= values[i]) {
                        roman.append(romanLetters[i]);
                        tempNumber -= values[i];
                    }
                }
                System.out.println(roman.toString());
            }
            System.out.print("\nWould you like to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity9(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter tuition fee: ");
            double tf = scanner.nextDouble();
            System.out.println("\n MAIN MENU");
            System.out.println(" Cash");
            System.out.println(" Two-installments");
            System.out.println(" Three-installments");
            System.out.print("Enter mode of payment: ");
            int mode = scanner.nextInt();
            switch (mode) {
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
    }

    public static void runActivity10(Scanner scanner) {
        String answer;
        do {
            System.out.print("Enter a grade number: ");
            int num = scanner.nextInt();
            if (num > 100) {
                System.out.println("Out of Range");
            } else if (num >= 98) {
                System.out.println("1.00");
            } else if (num >= 95) {
                System.out.println("1.25");
            } else if (num >= 92) {
                System.out.println("1.50");
            } else if (num >= 89) {
                System.out.println("1.75");
            } else if (num >= 85) {
                System.out.println("2.00");
            } else if (num >= 82) {
                System.out.println("2.25");
            } else if (num >= 80) {
                System.out.println("2.50");
            } else if (num >= 77) {
                System.out.println("2.75");
            } else if (num >= 75) {
                System.out.println("3.00");
            } else {
                System.out.println("Out of Range");
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity11(Scanner scanner) {
        String answer;
        do {
            int i = 1;
            System.out.print("\nEnter a number to be squared: ");
            int num = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (; i <= num; i++) {
                        System.out.println(i + "\t" + i * i);
                    }
                    break;
                case 2:
                    while (i <= num) {
                        System.out.println(i + "\t" + i * i);
                        i++;
                    }
                    break;
                case 3:
                    do {
                        System.out.println(i + "\t" + i * i);
                        i++;
                    } while (i <= num);
                    break;
                default:
                    System.out.println("\nInvalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity12(Scanner scanner) {
        String answer;
        do {
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            int i = 1;
            int j = num;
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (; i <= num; i++, j--) {
                        System.out.print(i + ", " + j + ", ");
                    }
                    break;
                case 2:
                    while (i <= num) {
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
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity13(Scanner scanner) {
        String answer;
        do {
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            int i = 1;
            int j = num;
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (; i <= num; i++, j--) {
                        System.out.print(j + ", " + i + ", ");
                    }
                    break;
                case 2:
                    while (i <= num) {
                        System.out.print(j + ", " + i + ", ");
                        i++;
                        j--;
                    }
                    break;
                case 3:
                    do {
                        System.out.print(j + ", " + i + ", ");
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
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity14(Scanner scanner) {
        String answer;
        do {
            int i = 1;
            int temp = 1;
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (; i <= num; i++) {
                        temp *= i;
                    }
                    System.out.println(temp);
                    break;
                case 2:
                    while (i <= num) {
                        temp *= i;
                        i++;
                    }
                    System.out.println(temp);
                    break;
                case 3:
                    do {
                        temp *= i;
                        i++;
                    } while (i <= num);
                    System.out.println(temp);
                    break;
                default:
                    System.out.println("\nInvalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity15(Scanner scanner) {
        String answer;
        do {
            int a = 1;
            int b = 1;
            int next;
            int count = 1;
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= num; i++) {
                        System.out.print(a + " ");
                        next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;
                case 2:
                    while (count <= num) {
                        System.out.print(a + " ");
                        next = a + b;
                        a = b;
                        b = next;
                        count++;
                    }
                    System.out.println();
                    break;
                case 3:
                    do {
                        System.out.print(a + " ");
                        next = a + b;
                        a = b;
                        b = next;
                        count++;
                    } while (count <= num);
                    System.out.println();
                    break;
                default:
                    System.out.println("\nInvalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity16(Scanner scanner) {
        String answer;
        do {
            long powerValue = 1;
            String computationSteps = "";
            System.out.print("Enter base number: ");
            int base = scanner.nextInt();
            System.out.print("Enter exponent number: ");
            int exponent = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int a = 1; a <= exponent; a++) {
                        powerValue *= base;
                        if (a == 1) {
                            computationSteps += base;
                        } else {
                            computationSteps += " * " + base;
                        }
                    }
                    System.out.println("Power value: " + powerValue + " (The computation is: " + base + "^" + exponent + " = " + computationSteps + " = " + powerValue + ")");
                    break;
                case 2:
                    int b = 1;
                    while (b <= exponent) {
                        powerValue *= base;
                        if (b == 1) {
                            computationSteps += base;
                        } else {
                            computationSteps += " * " + base;
                        }
                        b++;
                    }
                    System.out.println("Power value: " + powerValue + " (The computation is: " + base + "^" + exponent + " = " + computationSteps + " = " + powerValue + ")");
                    break;
                case 3:
                    int c = 1;
                    if (exponent > 0) {
                        do {
                            powerValue *= base;
                            if (c == 1) {
                                computationSteps += base;
                            } else {
                                computationSteps += " * " + base;
                            }
                            c++;
                        } while (c <= exponent);
                    } else {
                        computationSteps = "1";
                    }
                    System.out.println("Power value: " + powerValue + " (The computation is: " + base + "^" + exponent + " = " + computationSteps + " = " + powerValue + ")");
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity17(Scanner scanner) {
        String answer;
        do {
            int sum = 0;
            String comp = "";
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int a = 1; a <= num; a++) {
                        sum += (a * a);
                        if (a == 1) {
                            comp += a + "^2";
                        } else {
                            comp += " + " + a + "^2";
                        }
                    }
                    System.out.println("Output: " + sum + " because: " + comp + " = " + sum);
                    break;
                case 2:
                    int b = 1;
                    while (b <= num) {
                        sum += (b * b);
                        if (b == 1) {
                            comp += b + "^2";
                        } else {
                            comp += " + " + b + "^2";
                        }
                        b++;
                    }
                    System.out.println("Output: " + sum + " because: " + comp + " = " + sum);
                    break;
                case 3:
                    int c = 1;
                    if (num > 0) {
                        do {
                            sum += (c * c);
                            if (c == 1) {
                                comp += c + "^2";
                            } else {
                                comp += " + " + c + "^2";
                            }
                            c++;
                        } while (c <= num);
                    }
                    System.out.println("Output: " + sum + " because: " + comp + " = " + sum);
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity18(Scanner scanner) {
        String answer;
        do {
            int sum = 0;
            String comp = "";
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int a = 1; a <= num; a++) {
                        sum += a;
                        if (a == 1) {
                            comp += a;
                        } else {
                            comp += " + " + a;
                        }
                    }
                    System.out.println("Output: " + sum + " because: " + comp + " = " + sum);
                    break;
                case 2:
                    int b = 1;
                    while (b <= num) {
                        sum += b;
                        if (b == 1) {
                            comp += b;
                        } else {
                            comp += " + " + b;
                        }
                        b++;
                    }
                    System.out.println("Output: " + sum + " because: " + comp + " = " + sum);
                    break;
                case 3:
                    int c = 1;
                    if (num > 0) {
                        do {
                            sum += c;
                            if (c == 1) {
                                comp += c;
                            } else {
                                comp += " + " + c;
                            }
                            c++;
                        } while (c <= num);
                    }
                    System.out.println("Output: " + sum + " because: " + comp + " = " + sum);
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity19(Scanner scanner) {
        String answer;
        do {
            int reverse = 0;
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            int temp = n;
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int a = temp; a > 0; a /= 10) {
                        int digit = a % 10;
                        reverse = (reverse * 10) + digit;
                    }
                    System.out.println("Reverse number: " + reverse);
                    break;
                case 2:
                    int b = temp;
                    while (b > 0) {
                        int digit = b % 10;
                        reverse = (reverse * 10) + digit;
                        b /= 10;
                    }
                    System.out.println("Reverse number: " + reverse);
                    break;
                case 3:
                    int c = temp;
                    if (c > 0) {
                        do {
                            int digit = c % 10;
                            reverse = (reverse * 10) + digit;
                            c /= 10;
                        } while (c > 0);
                    }
                    System.out.println("Reverse number: " + reverse);
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity20(Scanner scanner) {
        String answer;
        do {
            long totalSum = 0;
            String comp = "";
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int a = 1; a <= n; a++) {
                        long power = 1;
                        for (int p1 = 1; p1 <= a; p1++) {
                            power *= a;
                        }
                        totalSum += power;
                        if (a == 1) {
                            comp += power;
                        } else {
                            comp += " + " + power;
                        }
                    }
                    System.out.println("Output: " + totalSum + "\nbecause: " + comp + " = " + totalSum);
                    break;
                case 2:
                    int b = 1;
                    while (b <= n) {
                        long power = 1;
                        int p2 = 1;
                        while (p2 <= b) {
                            power *= b;
                            p2++;
                        }
                        totalSum += power;
                        if (b == 1) {
                            comp += power;
                        } else {
                            comp += " + " + power;
                        }
                        b++;
                    }
                    System.out.println("Output: " + totalSum + "\nbecause: " + comp + " = " + totalSum);
                    break;
                case 3:
                    int c = 1;
                    if (n > 0) {
                        do {
                            long power = 1;
                            int p3 = 1;
                            do {
                                power *= c;
                                p3++;
                            } while (p3 <= c);
                            totalSum += power;
                            if (c == 1) {
                                comp += power;
                            } else {
                                comp += " + " + power;
                            }
                            c++;
                        } while (c <= n);
                    }
                    System.out.println("Output: " + totalSum + "\nbecause: " + comp + " = " + totalSum);
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while(answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity21(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = 1;
                        while (jWhile <= iWhile) {
                            System.out.print("");
                            jWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = 1;
                            do {
                                System.out.print("*");
                                jDo++;
                            } while (jDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity22(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(((i + j) % 2 == 0 ? "1 " : "0 "));
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = 1;
                        while (jWhile <= iWhile) {
                            System.out.print(((iWhile + jWhile) % 2 == 0 ? "1 " : "0 "));
                            jWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = 1;
                            do {
                                System.out.print(((iDo + jDo) % 2 == 0 ? "1 " : "0 "));
                                jDo++;
                            } while (jDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity23(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = rows;
                        while (jWhile > iWhile) {
                            System.out.print(" ");
                            jWhile--;
                        }
                        int kWhile = 1;
                        while (kWhile <= (2 * iWhile - 1)) {
                            System.out.print("");
                            kWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = rows;
                            while (jDo > iDo) {
                                System.out.print(" ");
                                jDo--;
                            }
                            int kDo = 1;
                            do {
                                System.out.print("*");
                                kDo++;
                            } while (kDo <= (2 * iDo - 1));
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity24(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = rows;
                        while (jWhile > iWhile) {
                            System.out.print(" ");
                            jWhile--;
                        }
                        int kWhile = 1;
                        while (kWhile <= iWhile) {
                            System.out.print(iWhile + " ");
                            kWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = rows;
                            while (jDo > iDo) {
                                System.out.print(" ");
                                jDo--;
                            }
                            int kDo = 1;
                            do {
                                System.out.print(iDo + " ");
                                kDo++;
                            } while (kDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity25(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = rows;
                        while (jWhile > iWhile) {
                            System.out.print(" ");
                            jWhile--;
                        }
                        int kWhile = 1;
                        while (kWhile <= iWhile) {
                            System.out.print("* ");
                            kWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = rows;
                            while (jDo > iDo) {
                                System.out.print(" ");
                                jDo--;
                            }
                            int kDo = 1;
                            do {
                                System.out.print("* ");
                                kDo++;
                            } while (kDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity26(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    int currentValFor = 1;
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(currentValFor++ + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int currentValWhile = 1;
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = rows;
                        while (jWhile > iWhile) {
                            System.out.print(" ");
                            jWhile--;
                        }
                        int kWhile = 1;
                        while (kWhile <= iWhile) {
                            System.out.print(currentValWhile++ + " ");
                            kWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int currentValDo = 1;
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = rows;
                            while (jDo > iDo) {
                                System.out.print(" ");
                                jDo--;
                            }
                            int kDo = 1;
                            do {
                                System.out.print(currentValDo++ + " ");
                                kDo++;
                            } while (kDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity27(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    int valFor = 1;
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(valFor++ + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int valWhile = 1;
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = 1;
                        while (jWhile <= iWhile) {
                            System.out.print(valWhile++ + " ");
                            jWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int valDo = 1;
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = 1;
                            do {
                                System.out.print(valDo++ + " ");
                                jDo++;
                            } while (jDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity28(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = 1;
                        while (jWhile <= iWhile) {
                            System.out.print(iWhile + " ");
                            jWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = 1;
                            do {
                                System.out.print(iDo + " ");
                                jDo++;
                            } while (jDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity29(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iWhile = 1;
                    while (iWhile <= rows) {
                        int jWhile = 1;
                        while (jWhile <= iWhile) {
                            System.out.print(jWhile + " ");
                            jWhile++;
                        }
                        System.out.println();
                        iWhile++;
                    }
                    break;
                case 3:
                    int iDo = 1;
                    if (rows > 0) {
                        do {
                            int jDo = 1;
                            do {
                                System.out.print(jDo + " ");
                                jDo++;
                            } while (jDo <= iDo);
                            System.out.println();
                            iDo++;
                        } while (iDo <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity30(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int n = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= n; i++) {
                        for (int j = n; j > i; j--) System.out.print(" ");
                        for (int k = 1; k <= (2 * i - 1); k++) System.out.print("");
                        System.out.println();
                    }
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = n; j > i; j--) System.out.print(" ");
                        for (int k = 1; k <= (2 * i - 1); k++) System.out.print("");
                        System.out.println();
                    }
                    break;
                case 2:
                    int iW1 = 1;
                    while (iW1 <= n) {
                        int jW1 = n;
                        while (jW1 > iW1) { System.out.print(" "); jW1--; }
                        int kW1 = 1;
                        while (kW1 <= (2 * iW1 - 1)) { System.out.print(""); kW1++; }
                        System.out.println();
                        iW1++;
                    }
                    int iW2 = n - 1;
                    while (iW2 >= 1) {
                        int jW2 = n;
                        while (jW2 > iW2) { System.out.print(" "); jW2--; }
                        int kW2 = 1;
                        while (kW2 <= (2 * iW2 - 1)) { System.out.print(""); kW2++; }
                        System.out.println();
                        iW2--;
                    }
                    break;
                case 3:
                    if (n > 0) {
                        int iDW1 = 1;
                        do {
                            int jDW1 = n;
                            while (jDW1 > iDW1) { System.out.print(" "); jDW1--; }
                            int kDW1 = 1;
                            do {
                                System.out.print("*");
                                kDW1++;
                            } while (kDW1 <= (2 * iDW1 - 1));
                            System.out.println();
                            iDW1++;
                        } while (iDW1 <= n);
                        int iDW2 = n - 1;
                        if (iDW2 >= 1) {
                            do {
                                int jDW2 = n;
                                while (jDW2 > iDW2) { System.out.print(" "); jDW2--; }
                                int kDW2 = 1;
                                do {
                                    System.out.print("*");
                                    kDW2++;
                                } while (kDW2 <= (2 * iDW2 - 1));
                                System.out.println();
                                iDW2--;
                            } while (iDW2 >= 1);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }

    public static void runActivity31(Scanner scanner) {
        String answer;
        do {
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.println("\nMAIN MENU");
            System.out.println(" For Loop");
            System.out.println(" While Loop");
            System.out.println(" Do-While Loop");
            System.out.print("Enter loop to be used: ");
            int loop = scanner.nextInt();
            System.out.print("\n");
            switch (loop) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(k);
                        }
                        for (int l = i - 1; l >= 1; l--) {
                            System.out.print(l);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int iW = 1;
                    while (iW <= rows) {
                        int jW = rows;
                        while (jW > iW) {
                            System.out.print(" ");
                            jW--;
                        }
                        int kW = 1;
                        while (kW <= iW) {
                            System.out.print(kW);
                            kW++;
                        }
                        int lW = iW - 1;
                        while (lW >= 1) {
                            System.out.print(lW);
                            lW--;
                        }
                        System.out.println();
                        iW++;
                    }
                    break;
                case 3:
                    int iDW = 1;
                    if (rows > 0) {
                        do {
                            int jDW = rows;
                            while (jDW > iDW) {
                                System.out.print(" ");
                                jDW--;
                            }
                            int kDW = 1;
                            do {
                                System.out.print(kDW);
                                kDW++;
                            } while (kDW <= iDW);
                            int lDW = iDW - 1;
                            if (lDW >= 1) {
                                do {
                                    System.out.print(lDW);
                                    lDW--;
                                } while (lDW >= 1);
                            }
                            System.out.println();
                            iDW++;
                        } while (iDW <= rows);
                    }
                    break;
                default:
                    System.out.println("Invalid number entered! Choose only from 1, 2, or 3.");
                    break;
            }
            System.out.print("\nDo you want to enter another number? (yes/no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));
    }
}
