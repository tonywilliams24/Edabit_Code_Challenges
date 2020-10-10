package Recursion.KaprekarsConstant;

import static Recursion.KaprekarsConstant.Challenge.kaprekar;

public class Main {
    public static void main(String[] args) {

        /*
            Kaprekar's Constant

            6174 is known as one of Kaprekar's constant, after the Indian mathematician D. R. Kaprekar.
            Number 6174 is notable for the following rule:

                1. Take any four-digit number, using at least two different digits (leading zeros are allowed).
                2. Arrange the digits in descending and then in ascending order to get two four-digit numbers, adding leading zeros if necessary.
                3. Subtract the smaller number from the bigger number.
                4. Go back to step 2 and repeat.

            The above process, known as Kaprekar's routine, will always reach its fixed point, 6174, in at most 7 iterations.
            Once 6174 is reached, the process will continue yielding 7641 – 1467 = 6174. For example, choose 3524:

                1. 5432 – 2345 = 3087
                2. 8730 – 0378 = 8352
                3. 8532 – 2358 = 6174
                4. 7641 – 1467 = 6174

            Write a recursive function that will return the number of times it will take to get from a number to 6174 (the above example would equal 3).
            495 would produce the following (Answer 4):
                1. 9540 - 459 = 9081
                2. 9810 - 189 = 9621
                3. 9621 - 1269 = 8352
                4. 8532 - 2358 = 6174

            Examples
            kaprekar(6621) ➞ 5
            kaprekar(6554) ➞ 4
            kaprekar(1234) ➞ 3

            Notes
            If the subtracted number is less than 1000, add an extra zero to that number. The number 1111 will equal 0000, so this number (1111) is invalid.
         */


        System.out.println(kaprekar(6621));
        System.out.println(kaprekar(6554));
        System.out.println(kaprekar(1234));
        System.out.println(kaprekar(3524));
        System.out.println(kaprekar(6174));
    }
}
