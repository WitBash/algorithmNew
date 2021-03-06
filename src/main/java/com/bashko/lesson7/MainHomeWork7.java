package com.bashko.lesson7;

public class MainHomeWork7 {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(1, 7);
        graph.addEdge(0, 2);
        graph.addEdge(0, 8);
        graph.addEdge(8, 9);
        graph.addEdge(9, 4);
        graph.addEdge(4, 3);
        graph.addEdge(3, 7);
        graph.addEdge(7, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 0);

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 0);
        System.out.println(bfp.hasPathTo(3));
        System.out.println(bfp.pathTo(3));
    }
}
