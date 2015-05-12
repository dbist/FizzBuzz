package com.ervits.play;


/**
 *
 * @author Artem Ervits
 * @created May 11, 2015 2:18:48 PM
 *
 * Project FizzBuzz
 *
 */
public class FizzBuzz {

    public static void main(String[] args) {

        for (int value = 1; value <= 100; value++) {
            System.out.printf("Value: %d\t%s\n", value, whatIsIt(value));
        }
    }

    public static String fizz() {
        return "fizz";
    }

    public static String buzz() {
        return "buzz";
    }

    public static String fizzbuzz() {
        return "fizzbuzz";
    }

    public static String whatIsIt(final int value) {
        String result = "";

        if (((value % 5) == 0) && ((value % 7) == 0)) {
            result = fizzbuzz();
        } else if ((value % 5) == 0) {
            result = fizz();
        } else if ((value % 7) == 0) {
            result = buzz();
        }
        return result;
    }
}

