package Dfs;

class TestGraph {
     
    private Graph testGraph;

    public TestGraph(){
        
        this.testGraph = new Graph(false, true);
        Vertex start = testGraph.addVertex("Start");
        Vertex A = testGraph.addVertex("A");
        Vertex B = testGraph.addVertex("B");
        Vertex C = testGraph.addVertex("C");
        Vertex D = testGraph.addVertex("D");
        Vertex E = testGraph.addVertex("E");
        Vertex F = testGraph.addVertex("F");
        Vertex G = testGraph.addVertex("G");

        testGraph.addEdge(start, A, null);
        testGraph.addEdge(start, B, null);
        testGraph.addEdge(A, C, null);
        testGraph.addEdge(B, D, null);
        testGraph.addEdge(C, D, null);
        testGraph.addEdge(D, E, null);
        testGraph.addEdge(D, F, null);
        testGraph.addEdge(E, F, null);
        testGraph.addEdge(F, G, null);

        testGraph.print();
    }

    public Vertex getStartingVertex(){
        return testGraph.getVertexs().get(0);
    }
}
