package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.print('F');
        System.out.print('r');
        System.out.print('a');
        System.out.print('n');
        System.out.print('c');
        System.out.print('e');
        System.out.print('s');
        System.out.print('c');
        System.out.println('o');
        // Write your code here
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        System.out.println("Age: " + 20);
        System.out.println("Have i had lunch today? : " + false);
        System.out.println("The lunch price is: " + 7.99);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        int age = 20;
        System.out.println("Age: " + age);
        boolean HadLunchToday = false;
        System.out.println("Have i had lunch today? " + HadLunchToday);
        double LunchPrice = 7.99;
        System.out.println("The lunch price is: " + LunchPrice);
    }
}
