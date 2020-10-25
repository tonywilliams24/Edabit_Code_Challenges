package recursionLoopsEtc.josephusProblem;

import static recursionLoopsEtc.josephusProblem.Challenge.*;

public class Main {
    public static void main(String[] args) {
        /*
        The Josephus Problem

        History (Wikipedia):
        The problem is named after Flavius Josephus, a Jewish historian living in the 1st century. According to
        Josephus' account of the siege of Yodfat, he and his 40 soldiers were trapped in a cave by Roman soldiers. They
        chose suicide over capture, and settled on a serial method of committing suicide by drawing lots. Josephus
        states that by luck or possibly by the hand of God, he and another man remained until the end and surrendered to
        the Romans rather than killing themselves.

        Challenge:
        Generalize this problem by creating a function that accepts the number of soldiers n and the interval at which
        they are killed i, and returns the position of THE LONE fortunate survivor.

        Examples

        josephus(41, 3) ➞ 31

        josephus(35, 11) ➞ 18

        josephus(11, 1) ➞ 11

        josephus(2, 2) ➞ 1

        Notes
        Assume the positions are numbered 1 to n going clockwise around the circle.
        If the interval is 3, the first soldiers to die are at positions 3, 6, and 9.
         */



        System.out.println(josephus(41, 3));
        System.out.println(josephus(14, 2));
        System.out.println(josephus(35, 11));
    }
}
