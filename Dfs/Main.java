package Dfs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TestGraph test = new TestGraph();
        Vertex startingVertex = test.getStartingVertex();

        ArrayList<Vertex> visitedVertexs = new ArrayList<>();
        visitedVertexs.add(startingVertex);

        System.out.println("DFS");
        DepthfirstSearch.depthFirstTraversal(startingVertex, visitedVertexs);
    }

}
