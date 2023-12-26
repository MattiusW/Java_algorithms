package dfsAndBfs;

class TestGraph {
     
    private Graph testGraph;

    public TestGraph(){
        
        Graph graph = new Graph(false, true);
        Vertex start = graph.addVertex("Start");
        Vertex A = graph.addVertex("A");
        Vertex B = graph.addVertex("B");
        Vertex C = graph.addVertex("C");
        Vertex D = graph.addVertex("D");
        Vertex E = graph.addVertex("E");
        Vertex F = graph.addVertex("F");
        Vertex G = graph.addVertex("G");

        graph.addEdge(start, A, null);
        graph.addEdge(start, B, null);
        graph.addEdge(A, C, null);
        graph.addEdge(B, D, null);
        graph.addEdge(C, D, null);
        graph.addEdge(D, E, null);
        graph.addEdge(D, F, null);
        graph.addEdge(E, F, null);
        graph.addEdge(F, G, null);

        graph.print();
    }

    public Vertex getStartingVertex(){
        return testGraph.getVertexs().get(0);
    }
}
