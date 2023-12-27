package ownGraph;

import java.util.ArrayList;
import java.util.LinkedList;


public class Graph {
    
    ArrayList<LinkedList<Node>> adjList;

    Graph(){
        adjList = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> cuLinkedList = new LinkedList<>();
        cuLinkedList.add(node);
        adjList.add(cuLinkedList);
    }

    public void addEdge(int src, int dst) {
        //Directed graph
        LinkedList<Node> currentList = adjList.get(src);
        Node dstNode = adjList.get(dst).get(0);
        currentList.add(dstNode);
        //Undirected graph
        Node scrNode = adjList.get(src).get(0);
        currentList.add(scrNode);
    }

    public void print() {
        for(LinkedList<Node> currentList : adjList) {
            for(Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
