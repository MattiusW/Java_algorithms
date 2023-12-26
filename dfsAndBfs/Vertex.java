package dfsAndBfs;

import java.util.ArrayList;

public class Vertex {

    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String data){
        this.data = data;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Vertex end, Integer weight){
        this.edges.add(new Edge(this, end, weight));
    }

    public String getData(){
        return data;
    }

    public ArrayList<Edge> getEdges(){
        return edges;
    }


    public void print(boolean showWeight){
        String message = "";

        if(edges.size() == 0){
            System.out.println(data + " -> ");
            return;
        }

        for(int i = 0; i < edges.size(); i++){
            if(i == 0){
                message += edges.get(i).getStart().data + " -> ";
            }

            message += edges.get(i).getEnd().data;

            if (showWeight){
                message += " coast:(" + edges.get(i).getWeight() + ")";
            }

            if(i != edges.size() - 1){
                message += ", ";
            }
        }
        System.out.println(message);
    }
}
