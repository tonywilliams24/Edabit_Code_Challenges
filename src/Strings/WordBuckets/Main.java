package Strings.WordBuckets;

import java.util.Arrays;

import static Strings.WordBuckets.Challenge.*;

public class Main {
    public static void main(String[] args) {

        /*
        Word Buckets

        Write a function that divides a phrase into word buckets, with each bucket containing n or fewer characters.
        Only include full words inside each bucket.

        Examples:
        Arrays.toString(bucketize("she sells sea shells by the sea", 10)
        ➞ ["she sells", "sea shells", "by the sea"]

        Arrays.toString(bucketize("the mouse jumped over the cheese", 7)
        ➞ ["the", "mouse", "jumped", "over", "the", "cheese"]

        Arrays.toString(bucketize("fairy dust coated the air", 20)
        ➞ ["fairy dust coated", "the air"]

        Arrays.toString(bucketize("a b c d e", 2)
        ➞ ["a", "b", "c", "d", "e"]

        Notes:
        Spaces count as one character.
        Trim beginning and end spaces for each word bucket (see final example).
        If buckets are too small to hold a single word, return an empty array: []
         */
          
        System.out.println(Arrays.toString(bucketize("she sells sea shells by the sea", 2)));
        System.out.println(Arrays.toString(bucketize("ab bc cd", 1)));
        System.out.println(Arrays.toString(bucketize("she sells sea shells by the sea", 10)));
        System.out.println(Arrays.toString(bucketize("the mouse jumped over the cheese", 7)));
        System.out.println(Arrays.toString(bucketize("fairy dust coated the air", 20)));
        System.out.println(Arrays.toString(bucketize("do the hokey pokey", 6)));
        System.out.println(Arrays.toString(bucketize("do the hokey pokey", 12)));
        System.out.println(Arrays.toString(bucketize("rich magnificent trees dotted the landscape", 12)));
        System.out.println(Arrays.toString(bucketize("rich magnificent trees dotted the landscape", 15)));
        System.out.println(Arrays.toString(bucketize("rich magnificent trees dotted the landscape", 18)));
        System.out.println(Arrays.toString(bucketize("rich magnificent trees dotted the landscape", 22)));
        System.out.println(Arrays.toString(bucketize("rich magnificent trees dotted the landscape", 40)));
        System.out.println(Arrays.toString(bucketize("rich magnificent trees dotted the landscape", 43)));
        System.out.println(Arrays.toString(bucketize("beep bo bee bop bee bo bo bop", 6)));
        System.out.println(Arrays.toString(bucketize("beep bo bee bop bee bo bo bop", 10)));
        System.out.println(Arrays.toString(bucketize("a b c d e", 3)));
        System.out.println(Arrays.toString(bucketize("a b c d e", 2)));
        System.out.println(Arrays.toString(bucketize("a b c d e", 1)));
    }
}
