package mathCryptographyEtc.LengthOf3dLineSegment;

import static mathCryptographyEtc.LengthOf3dLineSegment.Challenge.lineLength;

public class Main {
    public static void main(String[] args) {

        /*
        Geometry 2: Length of Line Segment in 3D

        Write a function that takes coordinates of two points on a three-dimensional plane
        and returns the length of the line segment connecting those two points.

        Examples:
          lineLength(arr[0]={15, 7, 5}, arr[1]={22, 11, 1}) ➞ 8.06
          lineLength(arr[0]={0, 0, 0}, arr[1]={0, 0, 0}) ➞ 0
          lineLength(arr[0]={0, 0, 0}, arr[1]={1, 1, 1}) ➞ 1.41

        Notes:
            Numbers in argument array can be positive or negative.
            The order of the given numbers is X, Y, Z.
            There is 0.1 tolerance, so you don't need to round your result.
        */

        System.out.println(lineLength(new int[][] {{15, 7, 5}, {22, 11, 1}}));
        System.out.println(lineLength(new int[][] {{0, 0, 0}, {0, 0, 0}}));
        System.out.println(lineLength(new int[][] {{0, 0, 0}, {1, 1, 1}}));

    }
}
