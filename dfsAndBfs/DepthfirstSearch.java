package dfsAndBfs;

import java.util.ArrayList;

public class DepthfirstSearch {
    
    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices){
        System.out.println("Visited: " + start.getData());

        for(Edge e : start.getEdges()){
            Vertex neighbor = e.getEnd();

            if(!visitedVertices.contains(neighbor)){
                visitedVertices.add(neighbor);
                DepthfirstSearch.depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

}
