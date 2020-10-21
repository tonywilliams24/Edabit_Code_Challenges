// INCOMPLETE (but close enough to take a look)

package DataStructures.DepthFirstTraversal;

import java.util.Arrays;

import static DataStructures.DepthFirstTraversal.Challenge.*;

public class Main {
    public static void main(String[] args) {


        // Tests copied from edabit.com

        int[][] graph1;
        int[][] graph2;
        int[][] graph3;
        int[][] singleNode;
        int[][] largeGraph;

        int[][] solution1;
        int[][] solution2;
        int[][] solution3;
        int[][] singleNodeSolution;
        int[][] largeSolution;

        graph1 = new int[][]{
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0}
        };
        graph2 = new int[][]{
                {0, 1, 1, 1, 0, 1},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0}
        };

        graph3 = new int[][]{
                {0, 1, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}
        };

        singleNode = new int[1][1];

        largeGraph = new int[1000][1000];
        for (int i = 0; i < largeGraph.length; i++) {
            for (int j = i + 1; j < largeGraph.length; j++) {
                largeGraph[i][j] = 1;
                largeGraph[j][i] = 1;
            }
        }

        solution1 = new int[][]{
                {1, 2, 4, 3, 5, 6},
                {6, 2, 5, 1, 3, 4}
        };

        solution2 = new int[][]{
                {1, 2, 5, 3, 4, 6},
                {6, 3, 5, 2, 1, 4}
        };

        solution3 = new int[][]{
                {1, 2, 4, 5, 6, 3, 7},
                {4, 3, 1, 7, 6, 2, 5}
        };

        singleNodeSolution = new int[][]{
                {1},
                {1}
        };

        largeSolution = new int[2][largeGraph.length];
        for (int i = 0; i < largeGraph.length; i++) {
            largeSolution[0][i] = i + 1;
            largeSolution[1][i] = largeGraph.length - i;
        }

        System.out.println((Arrays.deepToString(depthFirstSearch(graph1))));
        System.out.println((Arrays.deepToString(depthFirstSearch(graph2))));
        System.out.println((Arrays.deepToString(depthFirstSearch(graph3))));
        System.out.println((Arrays.deepToString(depthFirstSearch(singleNode))));
        System.out.println((Arrays.deepToString(depthFirstSearch(largeGraph))));

    }
}
