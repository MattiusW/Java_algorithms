package dfs;

public class Main {
    public static void main(String[] args) {
        Graph RRroad = new Graph(true, true);
        Vertex start = RRroad.addVertex("Start");
        Vertex A = RRroad.addVertex("A");
        Vertex B = RRroad.addVertex("B");
        Vertex C = RRroad.addVertex("C");
        Vertex D = RRroad.addVertex("D");
        Vertex E = RRroad.addVertex("E");
        Vertex F = RRroad.addVertex("F");
        Vertex G = RRroad.addVertex("G");

        RRroad.addEdge(start, A, 1);
        RRroad.addEdge(start, B, 1);
        RRroad.addEdge(A, C, 2);
        RRroad.addEdge(B, D, 2);
        RRroad.addEdge(C, D, 3);
        RRroad.addEdge(D, E, 2);
        RRroad.addEdge(D, F, 1);
        RRroad.addEdge(E, F, 1);
        RRroad.addEdge(F, G, 3);

        RRroad.print();
    }

}
