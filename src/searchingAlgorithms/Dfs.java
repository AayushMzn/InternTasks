package searchingAlgorithms;

// DFS algorithm in Java

import java.util.*;

public class Dfs {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
    public Dfs(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    public void dfsAlgorithm(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj]) {
                dfsAlgorithm(adj);
            }
        }
    }

    public static void main(String args[]) {
        Dfs g = new Dfs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.dfsAlgorithm(2);
    }
}