public class Main {
    
    public static void main(String[] args){
        System.out.println("Title: Graph Algorithms");
        System.out.println();
        System.out.println();

        //Graph matrix
        GraphMatrix graphMatrix = new GraphMatrix(5);
    

        graphMatrix.addNode(new Node('A'));
        graphMatrix.addNode(new Node('B'));
        graphMatrix.addNode(new Node('C'));
        graphMatrix.addNode(new Node('D'));
        graphMatrix.addNode(new Node('E'));

        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(2, 4);
        graphMatrix.addEdge(4, 0);
        graphMatrix.addEdge(4, 2);

        graphMatrix.print();
    }

}
