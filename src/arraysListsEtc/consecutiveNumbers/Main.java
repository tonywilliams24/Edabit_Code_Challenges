package arraysListsEtc.consecutiveNumbers;

import static arraysListsEtc.consecutiveNumbers.Challenge.cons;

public class Main {

    public static void main(String[] args) {

        /*
        Consecutive Numbers

        Create a function that determines whether elements in an array can be re-arranged to
        form a consecutive list of numbers where each number appears exactly once.

        Examples

        cons([5, 1, 4, 3, 2]) ➞ true
            ** Can be re-arranged to form [1, 2, 3, 4, 5]
        cons([5, 1, 4, 3, 2, 8]) ➞ false
        cons([5, 6, 7, 8, 9, 9]) ➞ false
            ** 9 appears twice
        */

        System.out.println(cons(new int[] {5, 1, 4, 3, 2}));
        System.out.println(cons(new int[] {5, 1, 4, 3, 2, 8}));
        System.out.println(cons(new int[] {5, 6, 7, 8, 9, 9}));

    }
}
