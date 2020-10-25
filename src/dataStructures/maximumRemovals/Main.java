package dataStructures.maximumRemovals;

import static dataStructures.maximumRemovals.Challenge.*;

public class Main {
    public static void main(String[] args) {

/*
        Maximum Removals
        https://edabit.com/challenge/fSohszsuqKXYDDjGb

        Given a string, a move is made by either removing the substring "actor" or by removing the substring "intact".
        Upon removing a substring, a new string is produced, and moves may be made from the new string until no more
        moves are possible.

        For example, given the string "inactortact", one can first remove the substring "actor" to get "intact" and then
        remove the substring "intact" to get the empty string from which point, no more moves are possible.

        The goal of this challenge is to determine the maximum number of moves that can be made from a starting string.
        Note that in some situations, more than one move is possible, and not all moves allow for as long of sequences
        of moves.

        For example, consider the string "actintactor". One could remove the substring "intact" to get "actor" and then
        remove "actor" to get to the empty string (2 moves), but removing "actor" from the end produces the substring
        "actint", from which no more moves are possible.


        Examples:

        "intactor": intactor" ➞ "int" (1 move)
        "actorbintact": "actorbintact" ➞ "bintact" ➞ "b" (2 moves)
        "intor": "intor" has no moves that can be made
        "intintactactororact": "intintactactororact" ➞ "intintactoract" ➞ "intintact" ➞ "int" (3 moves)


        Notes:

        All strings are composed of lowercase letters.
        Strings are between 0 and 1000 characters in length.
*/




        // TESTS ARE COPIED FROM THE CHALLENGE ON EDABIT.COM

        // A long string with a linear sequence of moves that can be made
        // 200 moves are possible
        String longString1;

        // A long string with many ways to achieve the longest sequence of moves
        // 180 moves are possible
        String longString2;

        // A long string with many different paths but not all of them are optimal
        // 180 moves are possible
        String longString3;

        // A long string where no moves are possible
        // No moves are possible
        String longString4;

        // Build Long Strings
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<200; i++) sb.append("act");
        for (int i=0; i<200; i++) sb.append("or");
        longString1 = sb.toString();

        sb = new StringBuilder();
        for (int i=0; i<40; i++) sb.append("actor");
        for (int i=0; i<100; i++) sb.append("intact");
        for (int i=0; i<40; i++) sb.append("actor");
        longString2 = sb.toString();

        sb = new StringBuilder();
        for (int i=0; i<80; i++) sb.append("act");
        for (int i=0; i<100; i++) sb.append("int");
        for (int i=0; i<100; i++) sb.append("act");
        for (int i=0; i<80; i++) sb.append("or");
        longString3 = sb.toString();

        sb = new StringBuilder();
        for (int i=0; i<200; i++) sb.append("or");
        for (int i=0; i<200; i++) sb.append("act");
        longString4 = sb.toString();
        
        
        System.out.println("Answer should be 1: " + moves("intactor"));
        System.out.println("Answer should be 2: " + moves("actorbintact"));
        System.out.println("Answer should be 3: " + moves("intintactactororact"));
        System.out.println("Answer should be 0: " + moves("intor"));
        System.out.println("Answer should be 0: " + moves(""));
        System.out.println("Answer should be 200: " + moves(longString1));
        // Test takes too long, need to improve efficiency
        System.out.println("Answer should be 180: " + moves(longString2));
        // Test takes too long, need to improve efficiency
        System.out.println("Answer should be 180: " + moves(longString3));
        System.out.println("Answer should be 0: " + moves(longString4));
    }
}
