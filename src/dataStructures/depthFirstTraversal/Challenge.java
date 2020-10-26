package dataStructures.depthFirstTraversal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class Challenge {
    static HashSet<Integer> visitedSet = new HashSet<>();
    static Queue<Integer> doneQueue = new LinkedList<>();
    static Queue<Integer> visitedQueue = new LinkedList<>();
    static HashMap<Integer, TreeSet<Integer>> graphMap = new LinkedHashMap();
    static int allNodes;

    public static int[][] depthFirstSearch(int[][] graph) {
        int start;
        int[][] result = new int[2][graph.length];
        visitedSet.clear();
        visitedQueue.clear();
        doneQueue.clear();
        buildGraphMap(graph);
        while(!graphMap.isEmpty()) {
            Map.Entry<Integer, TreeSet<Integer>> node = graphMap.entrySet().iterator().next();
            start = node.getKey();
            visitedSet.add(start);
            visitedQueue.add(start);
            dFS(start);
        }
        while(!visitedQueue.isEmpty()) {
            for(int i=0; i<graph.length; i++) {
                result[0][visitedQueue.poll()] = i+1;
            }
        }
        while(!doneQueue.isEmpty()){
            for(int i=0; i<graph.length; i++){
                result[1][doneQueue.poll()] = i+1;
            }
        }

        return result;
    }

    private static void buildGraphMap(int[][] graph) {
        graphMap.clear();
        allNodes =0;
        int V = graph.length;
        int E = graph[0].length;


        for(int i=0; i<V; i++) {
            graphMap.put(i, new TreeSet<>());
            for(int j=0; j<E; j++) {
                if(graph[i][j]!=0) addEdge(graphMap, i, j);
            }
        }
        allNodes = graphMap.size();
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
                if (visitedSet.contains(check)) {
                    try {
                        check = currentSet.pollFirst();
                    } catch (Exception e) {
                        check = -1;
                    }
                } else {
                    visitedSet.add(check);
                    visitedQueue.add(check);
                    dFS(check);
                }
            }
            if(visitedSet.size()== allNodes) break;
        }
        doneQueue.add(v);
        graphMap.remove(v);
        return;
    }


}
