package arraysListsEtc.burgerOrders;

import java.util.Arrays;

import static arraysListsEtc.burgerOrders.Challenge.*;

public class Main {
    public static void main(String[] args) {
        int[][] test1 = new int[5][5];
        test1[0][0] = 8;
        test1[0][1] = 1;
        test1[1][0] = 4;
        test1[1][1] = 2;
        test1[2][0] = 5;
        test1[2][1] = 6;
        test1[3][0] = 3;
        test1[3][1] = 1;
        test1[4][0] = 4;
        test1[4][1] = 3;
        System.out.println(Arrays.toString(jimOrders(test1)));

        int[][] test2 = new int[3][3];
        test2[0][0] = 1;
        test2[0][1] = 3;
        test2[1][0] = 2;
        test2[1][1] = 3;
        test2[2][0] = 3;
        test2[2][1] = 3;
        System.out.println(Arrays.toString(jimOrders(test2)));

        int[][] test3 = new int[2][2];
        test3[0][0] = 1;
        test3[0][1] = 1;
        test3[1][0] = 1;
        test3[1][1] = 1;
        System.out.println(Arrays.toString(jimOrders(test3)));

        int[][] test4 = new int[1][2];
        test4[0][0] = 1;
        test4[0][1] = 1;
        System.out.println(Arrays.toString(jimOrders(test4)));

        int[][] test5 = new int[13][13];
        test5[0][0] = 122470;
        test5[0][1] = 725261;
        test5[1][0] = 193218;
        test5[1][1] = 693005;
        test5[2][0] = 830347;
        test5[2][1] = 284246;
        test5[3][0] = 974815;
        test5[3][1] = 823134;
        test5[4][0] = 251206;
        test5[4][1] = 572501;
        test5[5][0] = 55509;
        test5[5][1] = 927152;
        test5[6][0] = 299590;
        test5[6][1] = 651593;
        test5[7][0] = 222305;
        test5[7][1] = 641645;
        test5[8][0] = 984018;
        test5[8][1] = 463771;
        test5[9][0] = 494787;
        test5[9][1] = 286091;
        test5[10][0] = 217190;
        test5[10][1] = 833029;
        test5[11][0] = 820867;
        test5[11][1] = 380896;
        test5[12][0] = 744986;
        test5[12][1] = 630663;
        System.out.println(Arrays.toString(jimOrders(test5)));
    }
}

