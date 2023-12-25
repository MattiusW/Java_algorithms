package studies;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    Map<Integer, Node> nodes;

    public Graph(){
        this.nodes = new HashMap<>();
    }

    public void addNode(int value){
        nodes.put(value, new Node(value));
    }

    public void addEdge(int source, int destination){
        Node sourceNode = nodes.get(source);
        Node destinationNode = nodes.get(destination);

        if(sourceNode != null && destinationNode != null){
            sourceNode.neigbors.add(destinationNode);
        }
    }

    public void display(){
        for (Node node : nodes.values()){
            System.out.print(node.value + " -> ");
            for (Node neigbor : node.neigbors) {
                System.out.print(neigbor.value + " ");
            }
            System.out.println();
        }
    }

    public void printAdjacencyMatrix() {
        System.out.println();
        System.out.println("Matrix:");
        System.out.print("  ");
        for (int i = 1; i <= nodes.size(); i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        int[][] matrix = new int[nodes.size()][nodes.size()];

        for (Node node : nodes.values()) {
            for (Node neighbor : node.neigbors) {
                matrix[node.value - 1][neighbor.value - 1] = 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
