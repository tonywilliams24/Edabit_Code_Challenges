package mathCryptographyEtc.ProductOfPrimes;

import static mathCryptographyEtc.ProductOfPrimes.Challenge.*;

public class Main {
    public static void main(String[] args) {

        /*
        Product of Two Prime Numbers

        Write a function that returns true if the given number num is a product of any two prime numbers.

        Examples
        System.out.println(productOfPrimes(2059) ➞ true
        // 29*71=2059
        System.out.println(productOfPrimes(10) ➞ true
        // 2*5=10
        System.out.println(productOfPrimes(25) ➞ true
        // 5*5=25
        System.out.println(productOfPrimes(999) ➞ false
        // There are no prime numbers.

        Notes:
        num is always greater than 0.
        0 and 1 aren't prime numbers.
         */


        System.out.println("2059: " + productOfPrimes(2059));
        System.out.println("7: " + productOfPrimes(7));
        System.out.println("25: " + productOfPrimes(25));
        System.out.println("39: " + productOfPrimes(39));
        System.out.println("5767: " + productOfPrimes(5767));
        System.out.println("77: " + productOfPrimes(77));
        System.out.println("12: " + productOfPrimes(12));
        System.out.println("10: " + productOfPrimes(10));
        System.out.println("999: " + productOfPrimes(999));
    }
}
