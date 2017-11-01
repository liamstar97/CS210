//CS210(c) F2017
//Liam Thompson
//This program contains all homework methods.

import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Homework Problem 8:
        System.out.println("The following is problem #8 output:");
        smallestLargest(console);

        //Homework Problem 11:
        System.out.println("The following is problem #11 output:");
        longestName(console,  4);

        //Homework Problem 15:
        System.out.println("The following is problem #15 output:");
        System.out.println(getGrade(71));

        //Homework Problem 18:
        System.out.println("The following is problem #18 output:");
        System.out.println(wordCount("  this  string  has  wide  spaces  "));

        //Homework Problem 20:
        System.out.println("The following is problem #20 output:");
        System.out.println(numUnique(18, 3, 4));
        System.out.println(numUnique(6, 7, 6));
        System.out.println(numUnique(4, 4, 4));


    }

    /**
     * returns smallest and largest inputted numbers
     * @param console console scanner
     */
    private static void smallestLargest(Scanner console) {
        try {
            System.out.print("How many numbers do you want to enter? ");
            int totalNum = console.nextInt();
            if (totalNum < 0) {
                System.out.println("You cannot enter a negative number! Please try again.");
                smallestLargest(console);
            } else {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < totalNum; i++) {
                    System.out.print("Number " + (i + 1) + ": ");
                    int j = console.nextInt();
                    if (j > max) {
                        max = j;
                    }
                    if (j < min) {
                        min = j;
                    }
                }
                System.out.println("Smallest = " + min +
                        "\nLargest = " + max);
            }
        } catch (InputMismatchException e) {
            console = new Scanner(System.in);
            System.out.println("That is not a number. Please try again!");
            smallestLargest(console);
        }
    }

    /**
     * returns the longest inputted name.
     * @param console console scanner
     * @param n number of names
     */
    private static void longestName(Scanner console,int n) {
        String longestName = "";
        int nameLength = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("name #" + i + "?");
            String name = console.next();
            if (name.length() > nameLength) {
                longestName = name;
                nameLength = name.length();
            }
        }
            System.out.println(longestName + "'s name is the longest");
    }

    /**
     * returns gpa of passed in grade
     * @param grade grade %
     * @return gpa
     */
    private static double getGrade(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Its impossible to get a grade worse than 0!");
        } else if (grade < 60) {
            return 0.0;
        } else if (grade <= 62) {
            return 0.7;
        } else if (grade < 95) {
            return Math.round((0.1 * (grade - 63) + 0.8) * 10.0) / 10.0;
        } else if (grade < 100) {
            return 4.0;
        } else {
            throw new IllegalArgumentException("No extra credit!");
        }
    }

    /**
     * returns the amount of words in the passed in string
     * @param s string
     * @return number of words
     */
    private static int wordCount(String s) {
        int wordCount = 0;
        s = s.trim();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                wordCount++;
            }
        }
        return wordCount + 1;
    }

    /**
     * returns the number of the passed in values which are unique
     * @param i value 1
     * @param j value 2
     * @param k value 3
     * @return number of unique values
     */
    private static int numUnique(int i, int j, int k) {
        if (i == j && i == k && j == k) {
            return 1;
        } else if (i == j || i == k || j == k) {
            return 2;
        } else {
            return 3;
        }
    }
}
