package Dfs;

import java.util.ArrayList;

public class Graph {
    
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected){
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertexOne, Vertex vertexTwo, Integer weight){
        if (!this.isWeighted){
            weight = null;
        }
        
        vertexOne.addEdge(vertexTwo, weight);

        if(!isDirected){
            vertexTwo.addEdge(vertexOne, weight);
        }
    }

    public ArrayList<Vertex> getVertexs(){
        return vertices;
    }

    public boolean isWeighted(){
        return isWeighted;
    }

    public boolean isDirected(){
        return isDirected;
    }

    public Vertex getVertexByValue(String value){
        for(Vertex v : vertices){
            if(v.getData().equals(value)){
                return v;
            }
        }
        return null;
    }

    public void print() {
        for(Vertex v : vertices){
            v.print(isWeighted);
        }
    }
}
