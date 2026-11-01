package com.mycompany.ooprproj1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaPrograms_Practice {
    private static final Scanner SC = new Scanner(System.in);
    private static final List<String> TITLES = new ArrayList<>();
    private static final List<Runnable> ACTIONS = new ArrayList<>();

    public static void main(String[] args) {
        registerPrograms();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Enter program number (0 to exit): ");

            if (choice == 0) {
                System.out.println("\nGoodbye!");
                running = false;
            } else if (choice >= 1 && choice <= ACTIONS.size()) {
                System.out.println("\n--- " + TITLES.get(choice - 1) + " ---\n");
                try {
                    ACTIONS.get(choice - 1).run();
                } catch (RuntimeException e) {
                    System.out.println("\nSomething went wrong: " + e);
                }
                System.out.println("\n\nPress Enter to return to the menu...");
                SC.nextLine();
            } else {
                System.out.println("\nInvalid choice! Please pick 0-" + ACTIONS.size() + ".");
            }
        }
        SC.close();
    }

    private static void add(String title, Runnable action) {
        TITLES.add(title);
        ACTIONS.add(action);
    }

    private static void printMenu() {
        System.out.println("\n==================================================================");
        System.out.println("                      JAVA PROGRAMS MENU");
        System.out.println("==================================================================");
        for (int i = 0; i < TITLES.size(); i++) {
            System.out.printf(" %2d. %s%n", i + 1, TITLES.get(i));
        }
        System.out.println("  0. Exit");
        System.out.println("==================================================================");
    }

    /** Reads a whole line and turns it into an int, asking again until it is valid. */
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = SC.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static void registerPrograms() {
        add("Display odd numbers between 1-100", JavaPrograms_Practice::oddNumbers);
        add("Sum of odd numbers between 1-100", JavaPrograms_Practice::sumOfOddNumbers);
        add("Total count of odd numbers between 1-100", JavaPrograms_Practice::countOddNumbers);
        add("Sum of first n numbers", JavaPrograms_Practice::sumOfFirstN);
        add("Sum of the digits of a number", JavaPrograms_Practice::sumOfDigits);
        add("Calculate electricity bill", JavaPrograms_Practice::electricBill);
        add("Armstrong number check", JavaPrograms_Practice::armstrongCheck);
        add("Armstrong numbers between 1-1000", JavaPrograms_Practice::armstrongRange);
        add("Print a number in words", JavaPrograms_Practice::numberToWords);
        add("Palindrome number check", JavaPrograms_Practice::palindromeNumber);
        add("Palindrome numbers up to N", JavaPrograms_Practice::palindromeUpToN);
        add("Prime numbers between 1-100", JavaPrograms_Practice::primeNumbers);
        add("Pattern: star triangle", JavaPrograms_Practice::pyramidPattern1);
        add("Pattern: star pyramid (right-leaning)", JavaPrograms_Practice::pyramidPattern2);
        add("Pattern: star butterfly", JavaPrograms_Practice::butterflyPattern);
        add("Floyd's triangle", JavaPrograms_Practice::floydsTriangle);
        add("Numbers in sequence", JavaPrograms_Practice::numberSequence);
        add("Pattern: 1 / 121 / 12321 pyramid", JavaPrograms_Practice::numberPyramidPrevRev);
        add("Pattern: consecutive-number triangle", JavaPrograms_Practice::numberPyramidUptoN);
        add("Pattern: 1 / 1 2 / 1 2 3 triangle", JavaPrograms_Practice::numberPyramid);
        add("Pattern: number arrow (up then down)", JavaPrograms_Practice::numberPyramidArrow);
        add("Pattern: 1 / 212 / 32123 pyramid", JavaPrograms_Practice::numberPyramidRev);
        add("Pattern: inverted star triangle", JavaPrograms_Practice::star1);
        add("Pattern: star triangles with gap", JavaPrograms_Practice::star3);
        add("Pattern: star diamond", JavaPrograms_Practice::star10);
        add("Largest number in an array", JavaPrograms_Practice::largestInArray);
        add("Second largest number in an array", JavaPrograms_Practice::secondLargestInArray);
        add("Largest and smallest number in an array", JavaPrograms_Practice::largestAndSmallest);
        add("Largest and second largest in an array", JavaPrograms_Practice::largestAndSecondLargest);
        add("Index of the largest number in an array", JavaPrograms_Practice::indexOfLargest);
        add("Index of the smallest number in an array", JavaPrograms_Practice::indexOfSmallest);
        add("Remove duplicate elements in an array", JavaPrograms_Practice::removeDuplicatesInArray);
        add("Odd and even numbers from an array", JavaPrograms_Practice::oddEvenArray);
        add("Add two matrices", JavaPrograms_Practice::matrixAddition);
        add("Check for a null matrix", JavaPrograms_Practice::nullMatrix);
        add("Check for a diagonal matrix", JavaPrograms_Practice::diagonalMatrix);
        add("Linear search", JavaPrograms_Practice::linearSearch);
        add("Binary search", JavaPrograms_Practice::binarySearch);
        add("HCF and LCM", JavaPrograms_Practice::hcfAndLcm);
        add("Volume of a cube", JavaPrograms_Practice::cubeVolume);
        add("Reverse of a given number", JavaPrograms_Practice::reverseNumber);
        add("Convert integer to Roman numerals", JavaPrograms_Practice::integerToRoman);
        add("Count number of words in a string", JavaPrograms_Practice::wordCount);
        add("Count duplicate words in a string", JavaPrograms_Practice::countDuplicateWords);
        add("Remove duplicate words in a string", JavaPrograms_Practice::removeDuplicateWords);
        add("Count each word and total words", JavaPrograms_Practice::countEachWord);
        add("Reverse a string / palindrome check", JavaPrograms_Practice::stringPalindrome);
        add("Delete vowels from a string", JavaPrograms_Practice::deleteVowels);
        add("Capitalize first letter of each word", JavaPrograms_Practice::capitalizeWords);
        add("Split a comma-separated string", JavaPrograms_Practice::commaSeparated);
        add("ASCII values to characters", JavaPrograms_Practice::asciiToCharacter);
        add("Replace vowels with a star", JavaPrograms_Practice::replaceVowelsWithStar);
        add("Character position count in a string", JavaPrograms_Practice::letterPositionCount);
        add("Reverse a line word by word", JavaPrograms_Practice::reverseWords);
        add("Reverse text (word order)", JavaPrograms_Practice::stringReverse);
        add("Difference of max and min in an array", JavaPrograms_Practice::minMaxDifference);
        add("Count occurrences of each character", JavaPrograms_Practice::characterOccurrences);
    }

    private static void oddNumbers() {
        System.out.println("The Odd Numbers are:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void sumOfOddNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The Sum Of Odd Numbers between 1-100 is: " + sum);
    }

    private static void countOddNumbers() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("The Count Of Odd Numbers is: " + count);
    }

    private static void sumOfFirstN() {
        int n = readInt("Enter n: ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum Of " + n + " Numbers is: " + sum);
    }

    private static void sumOfDigits() {
        int num = readInt("Enter a number: ");
        int original = num;
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.print("Sum of Digits of " + original + " is " + sum);
    }

    private static void electricBill() {
        int units = readInt("Enter units consumed: ");
        int bill = 0;

        if (units > 100) {
            if (units >= 200) {
                if (units > 300) {
                    bill = units * 8;
                } else {
                    bill = units * 6;
                }
            } else {
                bill = units * 5;
            }
        }

        System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI");
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill : " + bill);
    }

    private static void armstrongCheck() {
        int n = readInt("Enter a number: ");
        int arg = n, sum = 0, r;

        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        if (arg == sum) {
            System.out.println("Given number is armstrong number: " + arg);
        } else {
            System.out.println("Given number is not armstrong number: " + arg);
        }
    }

    private static void armstrongRange() {
        int num, rem, limit = 1000, sum = 0;
        System.out.print("Armstrong numbers from 1 to " + limit + ": ");
        for (int i = 1; i <= limit; i++) {
            num = i;
            while (num > 0) {
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }

    private static void numberToWords() {
        int n = readInt("Enter a number: ");
        System.out.print(n);
        if (n <= 0) {
            System.out.println("\nEnter numbers greater than 0");
        } else {
            printWords(n / 1000000000, " Hundred");
            printWords((n / 10000000) % 100, " crore");
            printWords((n / 100000) % 100, " lakh");
            printWords((n / 1000) % 100, " thousand");
            printWords((n / 100) % 10, " hundred");
            printWords(n % 100, " ");
        }
    }

    private static void printWords(int n, String suffix) {
        String[] one = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven",
            " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen",
            " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen" };
        String[] ten = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty",
            " Seventy", " Eighty", " Ninety" };

        if (n > 19) {
            System.out.print(ten[n / 10] + " " + one[n % 10]);
        } else {
            System.out.print(one[n]);
        }
        if (n > 0) {
            System.out.print(suffix);
        }
    }

    private static void palindromeNumber() {
        int n = readInt("Enter a number: ");
        int pal = n, r, rev = 0;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == pal) {
            System.out.println("The given no is palindrome " + rev);
        } else {
            System.out.println("The given no is not palindrome " + rev);
        }
    }

    private static void palindromeUpToN() {
        int n, b, rev = 0;
        int limit = readInt("Enter the limit: ");
        System.out.print("Palindrome numbers from 1 to " + limit + ": ");
        for (int i = 1; i <= limit; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if (rev == i) {
                System.out.print(i + " ");
            }
            rev = 0;
        }
    }

    private static void primeNumbers() {
        System.out.println("Prime numbers from 1 to 100 are :");
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }

    private static void pyramidPattern1() {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void pyramidPattern2() {
        int i, j, k = 8;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void butterflyPattern() {
        int n, i, j, k, l, m, p, q;
        n = readInt("Enter the n value: ");
        p = n;
        q = n;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (k = p * 2; k < n * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (l = i; l != 0; l--) {
                if (l == n) {
                    continue;
                }
                System.out.print("*");
            }
            p--;
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (k = q * 2 - 2; k > 1; k--) {
                System.out.print(" ");
            }
            for (m = i; m != 0; m--) {
                if (m == n) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
            q--;
        }
    }

    private static void floydsTriangle() {
        int rows = readInt("Enter the number of rows: ");
        System.out.println("Floyd's Triangle Generated\n");
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    private static void numberSequence() {
        int a = 3;
        int b = 4;
        int n = 8;
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.println(a + " " + b + " " + c);
            a = c;
            b = b + 1;
        }
    }

    private static void numberPyramidPrevRev() {
        int s = 1;
        int n = readInt("Enter the N value: ");
        for (int i = 1; i <= n; i++) {
            while (s <= i) {
                System.out.print(s);
                s++;
            }
            s--;
            while (s > 1) {
                System.out.print(--s);
            }
            System.out.println();
        }
    }

    private static void numberPyramidUptoN() {
        int i, j, n = 1;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    private static void numberPyramid() {
        int i, j, n;
        n = readInt("Enter the Row value n: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.print("\n");
        }
    }

    private static void numberPyramidArrow() {
        int i, j, n;
        n = readInt("Enter the value of n: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.print("\n");
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.print("\n");
        }
    }

    private static void numberPyramidRev() {
        int i, j, k, n, a;
        n = readInt("Enter the n value: ");
        a = n;
        for (i = 1; i <= n; i++) {
            for (j = a; j > 1; j--) {
                System.out.print(" ");
            }
            for (k = i; k != 0; k--) {
                System.out.print(k);
            }
            a--;
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    private static void star1() {
        int i, j, t;
        t = readInt("How many rows do you want? ");
        for (j = 0; j < t; j++) {
            for (i = t - 1; i >= j; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void star3() {
        int i, j, k, n = 3;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (j = (n - i); j >= 2; j--) {
                System.out.print(" ");
            }
            for (k = i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void star10() {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = 4; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void largestInArray() {
        int[] a = new int[] { 20, 30, 50, 4, 71, 100 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("The Given Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("From The Array Elements, Largest Number is: " + max);
    }

    private static void secondLargestInArray() {
        int[] arr = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is: " + secondLargest);
    }

    private static void largestAndSmallest() {
        int[] a = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Largest Number in a given array is : " + max);
        System.out.println("Smallest Number in a given array is : " + min);
    }

    private static void largestAndSecondLargest() {
        int[] nums = { 5, 34, 78, 2, 45, 1, 99, 23 };
        int maxOne = 0;
        int maxTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxOne < nums[i]) {
                maxTwo = maxOne;
                maxOne = nums[i];
            } else if (maxTwo < nums[i]) {
                maxTwo = nums[i];
            }
        }
        System.out.println("Largest Number: " + maxOne);
        System.out.println("Second Largest Number: " + maxTwo);
    }

    private static void indexOfLargest() {
        int[] a = new int[] { 12, 44, 23, 56, 23, 78, 13 };
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Index position of Maximum value in an array is : " + index);
    }

    private static void indexOfSmallest() {
        int[] a = new int[] { 12, 44, 23, 56, 9, 23, 78, 13 };
        int min = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        System.out.println("Index position of Smallest value in a given array is : " + index);
    }

    private static int[] removeDuplicates(int[] input) {
        int j = 0;
        int i = 1;
        if (input.length < 2) {
            return input;
        }
        while (i < input.length) {
            if (input[i] == input[j]) {
                i++;
            } else {
                input[++j] = input[i++];
            }
        }
        int[] output = new int[j + 1];
        for (int k = 0; k < output.length; k++) {
            output[k] = input[k];
        }
        return output;
    }

    private static void removeDuplicatesInArray() {
        int[] input1 = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };

        System.out.print("Input Elements: \n");
        for (int i : input1) {
            System.out.print(i + " ");
        }

        int[] output = removeDuplicates(input1);

        System.out.print("\nOutput Elements: \n");
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    private static void oddEvenArray() {
        int s, i;
        int[] a = { 33, 2, 4, 71, 88, 92, 9, 1 };
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
        System.out.print("Input numbers (sorted) :");
        for (i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.print("\nOdd numbers :");
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.print("\nEven numbers :");
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(" " + a[i]);
            }
        }
    }

    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void matrixAddition() {
        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = new int[][] { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
        int[][] c = new int[3][3];

        if (a.length == b.length && a[0].length == b[0].length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        } else {
            System.out.println("'A' and 'B' Matrix are not SAME");
            return;
        }

        System.out.println("The Matrix 'A' Value:");
        printMatrix(a);

        System.out.println("The Matrix 'B' Value:");
        printMatrix(b);

        System.out.println("The Addition Matrix of 'A' and 'B' Value:");
        printMatrix(c);
    }

    private static void nullMatrix() {
        int[][] a = new int[][] { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 0, 0 } };
        boolean setValue = true;

        abc:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    setValue = false;
                    break abc;
                }
            }
        }

        System.out.println("The Given Matrix Value:");
        printMatrix(a);

        if (setValue) {
            System.out.println("The Given Matrix is a Null Matrix");
        } else {
            System.out.println("The Given Matrix is not a Null Matrix");
        }
    }

    private static void diagonalMatrix() {
        int[][] a = new int[][] { { 1, 0, 1 }, { 0, 3, 0 }, { 0, 0, 3 } };
        boolean setValue = true;

        abc:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    if (a[i][j] == 0) {
                        setValue = false;
                        break abc;
                    }
                } else if (a[i][j] != 0) {
                    setValue = false;
                    break abc;
                }
            }
        }

        System.out.println("The Given Matrix Value:");
        printMatrix(a);

        if (setValue) {
            System.out.println("The Given Matrix is a Diagonal Matrix");
        } else {
            System.out.println("The Given Matrix is not a Diagonal Matrix");
        }
    }

    private static void linearSearch() {
        int i, num, searchVal;
        int[] array;

        num = readInt("Enter number of elements: ");
        array = new int[num];
        System.out.println("Enter " + num + " integers");
        for (i = 0; i < num; i++) {
            array[i] = readInt("  Element " + (i + 1) + ": ");
        }
        searchVal = readInt("Enter the search value: ");

        for (i = 0; i < num; i++) {
            if (array[i] == searchVal) {
                System.out.println(searchVal + " is present at location " + (i + 1));
                break;
            }
        }
        if (i == num) {
            System.out.println(searchVal + " does not exist in the array.");
        }
    }

    private static void binarySearch() {
        int counter, num, item, first, last, middle;
        int[] array;

        num = readInt("Enter number of elements: ");
        array = new int[num];
        System.out.println("Enter " + num + " integers in ascending order");
        for (counter = 0; counter < num; counter++) {
            array[counter] = readInt("  Element " + (counter + 1) + ": ");
        }
        item = readInt("Enter the search value: ");

        first = 0;
        last = num - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < item) {
                first = middle + 1;
            } else if (array[middle] == item) {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(item + " is not found.");
        }
    }

    private static void hcfAndLcm() {
        int a, b, x, y, t, hcf, lcm;
        x = readInt("Enter first number: ");
        y = readInt("Enter second number: ");
        a = x;
        b = y;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        hcf = a;
        lcm = (x * y) / hcf;
        System.out.print("HCF and LCM of : " + x + " and " + y + " is :\n");
        System.out.print("HCF = " + hcf);
        System.out.print("\nLCM = " + lcm);
    }

    private static void cubeVolume() {
        int side = readInt("Enter the side of the cube: ");
        float volume = side * side * side;
        System.out.println("Volume of Cube : " + volume);
    }

    private static void reverseNumber() {
        int rev = 0;
        int num = readInt("Enter a number: ");
        int no = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rem + (rev * 10);
            num = num / 10;
        }
        System.out.println("Number = " + no);
        System.out.println("Reverse = " + rev);
    }

    private static void integerToRoman() {
        int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        int no = readInt("Enter the number: ");
        int num = no;
        String result = "";
        for (int i : bases) {
            while (num >= i) {
                result += map.get(i);
                num -= i;
            }
        }
        System.out.println(no + " ---> " + result);
    }

    private static void wordCount() {
        String s = "welcome to candid java tutorial";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("String: " + s);
        System.out.println("Number of words in a string = " + count);
    }

    private static void countDuplicateWords() {
        String input = "Welcome to Java Session Session Session";
        String[] words = input.split(" ");
        int wrc = 1;
        System.out.println("String: " + input + "\n");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;
                    words[j] = "0";
                }
            }
            if (!words[i].equals("0")) {
                System.out.println(words[i] + "--" + wrc);
            }
            wrc = 1;
        }
    }

    private static void removeDuplicateWords() {
        String input = "Welcome to Java Session Java Session Session Java";
        String[] words = input.split(" ");
        System.out.println("String: " + input + "\n");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        words[j] = null;
                    }
                }
            }
        }
        for (int k = 0; k < words.length; k++) {
            if (words[k] != null) {
                System.out.println(words[k]);
            }
        }
    }

    private static void countEachWord() {
        String st = "apple banna apple fruit fruit apple hello hi hi hello hi";
        String[] words = st.split("\\s");
        int[] fr = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    fr[i]++;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (i != j) {
                        words[i] = "";
                    }
                }
            }
        }

        int total = 0;
        System.out.println("Words and words count:");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                System.out.println(words[i] + "=" + fr[i]);
                total += fr[i];
            }
        }
        System.out.println("Total words counted: " + total);
    }

    private static void stringPalindrome() {
        System.out.print("Enter a string: ");
        String inpstr = SC.nextLine().trim();
        char[] inpArray = inpstr.toCharArray();
        char[] revArray = new char[inpArray.length];
        int j = 0;
        for (int i = inpArray.length - 1; i >= 0; i--) {
            revArray[j] = inpArray[i];
            j++;
        }
        String revstr = String.valueOf(revArray);
        System.out.println("Reversed string: " + revstr);
        if (inpstr.equals(revstr)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }

    private static void deleteVowels() {
        String string = "Welcome to Candid Java Programming";
        System.out.println("Input String : " + string);
        string = string.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(string);
    }

    private static void capitalizeWords() {
        String str = "welcome to candid java program";
        StringBuilder result = new StringBuilder(str.length());
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                result.append(Character.toUpperCase(words[i].charAt(0)))
                      .append(words[i].substring(1))
                      .append(" ");
            }
        }
        System.out.println("Input String : " + str);
        System.out.println(result);
    }

    private static void commaSeparated() {
        String input = "Welcome,to,Java Session Session Session";
        String[] words = input.split(",");
        for (int k = 0; k < words.length; k++) {
            System.out.println(words[k]);
        }
    }

    private static void asciiToCharacter() {
        char c;
        for (int i = 65; i <= 90; i++) {
            c = (char) i;
            System.out.println(i + " = " + c);
        }
    }

    private static void replaceVowelsWithStar() {
        String string = "Welcome to Candid Java Programming";
        System.out.println("Input String : " + string);
        string = string.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(string);
    }

    private static void letterPositionCount() {
        String s = "CANDIDJAVA";
        char[] a = s.toCharArray();
        int i = 1;
        for (char output : a) {
            System.out.print(output + " " + i + " ");
            i++;
        }
    }

    private static void reverseWords() {
        String input = "Welcome to Java Session";
        String[] words = input.split(" ");
        String[] revwords = new String[words.length];
        int j = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            revwords[j] = words[i];
            System.out.print(revwords[j] + " ");
            j++;
        }
    }

    private static void stringReverse() {
        String string = "Welcome to Java Programming and Dotnet Programming";
        String[] wordsCount = string.split(" ");

        System.out.println("The Given String is:\n" + string + "\n");
        System.out.println("After Reverse String is:");

        for (int i = wordsCount.length; i > 0; i--) {
            System.out.print(wordsCount[i - 1] + " ");
        }
    }

    private static void minMaxDifference() {
        int n = readInt("Enter number of elements you want to enter: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readInt("Enter [" + (i + 1) + "] element: ");
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);
        System.out.print("Difference between Minimum and Maximum in array is : " + (max - min));
    }

    private static void characterOccurrences() {
        final int MAX_CHAR = 256;
        String str = "geeksforgeeks";
        int[] count = new int[MAX_CHAR];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        char[] ch = new char[len];
        System.out.println("String: " + str + "\n");
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }
            if (find == 1) {
                System.out.println("Number of Occurrence of " + str.charAt(i)
                    + " is: " + count[str.charAt(i)]);
            }
        }
    }
}