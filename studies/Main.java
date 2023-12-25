package studies;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(5, 3);
        graph.addEdge(1, 2);

        graph.display();
        
        
        Graph matrix = new Graph();
        for (int i = 1; i <= 9; i++){
            matrix.addNode(i);
        }

        matrix.addEdge(2, 4);
        matrix.addEdge(5, 2);
        matrix.addEdge(3, 8);
        matrix.addEdge(3, 6);
        matrix.addEdge(6, 5);
        matrix.addEdge(5, 2);
        matrix.addEdge(9, 1);
        matrix.addEdge(8, 1);

        matrix.printAdjacencyMatrix();
    }
}
