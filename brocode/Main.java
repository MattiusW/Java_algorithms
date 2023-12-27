package brocode;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Title: Graph Algorithms");
        System.out.println();
        System.out.println();

        //Graph matrix
        GraphMatrix graphMatrix = new GraphMatrix(5);

        //Graph list
        GraphList graphList = new GraphList();

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


        graphList.addNode(new Node('A'));
        graphList.addNode(new Node('B'));
        graphList.addNode(new Node('C'));
        graphList.addNode(new Node('D'));
        graphList.addNode(new Node('E'));

        graphList.addEdge(0, 2);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 4);
        graphList.addEdge(4, 2);
        graphList.addEdge(0, 1);

        graphMatrix.print();
        System.out.println("DFS:");
        graphMatrix.depthFirstSearch(0);
        System.out.println("BFS:");
        graphMatrix.breadthFirstSearch(1);
        System.out.println();
        
        System.out.println("List graph:");
        System.out.println();

        graphList.print();

        System.out.println();

    }

}
