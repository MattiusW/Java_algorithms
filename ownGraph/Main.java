package ownGraph;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();
        
        // graph.addNode(new Node('S')); //0
        // graph.addNode(new Node('A')); //1
        // graph.addNode(new Node('B')); //2
        // graph.addNode(new Node('C')); //3
        // graph.addNode(new Node('D')); //4
        // graph.addNode(new Node('E')); //5
        // graph.addNode(new Node('F')); //6
        // graph.addNode(new Node('G')); //7

        // graph.addEdge(0, 1); //S A
        // graph.addEdge(0, 2); //S B
        // graph.addEdge(2, 4); //B D
        // graph.addEdge(1, 3); //A C
        // graph.addEdge(3, 4); //C D
        // graph.addEdge(4, 5); //D E
        // graph.addEdge(4, 6); //D F
        // graph.addEdge(5, 6); //E F
        // graph.addEdge(6, 7); //F G

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));

        graph.addEdge(0, 1);

        graph.print();
    }
}
