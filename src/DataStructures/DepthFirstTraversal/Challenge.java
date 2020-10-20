// INCOMPLETE (but close enough to take a look)

package DataStructures.DepthFirstTraversal;

import java.util.*;

public class Challenge {
    static HashSet<Integer> visitedSet = new HashSet<>();
    static Queue<Integer> doneQueue = new LinkedList<>();
    static ArrayList<Integer> visitedList = new ArrayList<>();
    static HashMap<Integer, TreeSet<Integer>> graphMap = new HashMap();

    public static int[][] depthFirstSearch(int[][] graph) {
        int[][] result = new int[2][graph.length];
        visitedSet.clear();
        visitedList.clear();
        doneQueue.clear();
        visitedSet.add(0);
        visitedList.add(1);
        buildGraphMap(graph);
        dFS(0);
//        System.out.println(visitedList);
//        System.out.println(doneQueue);
        for(int i=0; i<graph.length; i++) {
            result[0][i] = visitedList.get(i);
        }
        while(!doneQueue.isEmpty()){
            for(int i=0; i<graph.length; i++){
                result[1][doneQueue.poll()] = i+1;
            }
        }
//        System.out.println(Arrays.deepToString(result));

        return result;
    }

    private static void buildGraphMap(int[][] graph) {
        graphMap.clear();
        int V = graph.length;
        int E = graph[0].length;


        for(int i=0; i<V; i++) {
//            System.out.print(i + " ");
            graphMap.put(i, new TreeSet<>());
            for(int j=0; j<E; j++) {
                if(graph[i][j]!=0) addEdge(graphMap, i, j);
            }
//            System.out.println(graphMap.get(i));
        }
    }

    static void addEdge(HashMap<Integer, TreeSet<Integer>> graph, int v, int e) {
        graph.get(v).add(e);
    }

    static void dFS(int v) {
        TreeSet<Integer> currentSet;
        int check;
        currentSet = graphMap.get(v);

        while(!currentSet.isEmpty()) {
            check = currentSet.pollFirst();
            while (check != -1) {
                if(visitedSet.contains(check)) {
                    try {
                        check = currentSet.pollFirst();
                    } catch (Exception e) {
                        check = -1;
                    }
                }
                else {
                    visitedSet.add(check);
                    visitedList.add(check+1);
                    dFS(check);
                }
            }
        }
        doneQueue.add(v);
        return;
    }


}
