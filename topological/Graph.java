package topological;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Graph {
    
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    Graph(int v){
        V = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; ++i){
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int v, int w){
        adj.get(v).add(w);
    }

    public void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack){
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj.get(v).iterator();
        
        while (it.hasNext()){
            i = it.next();
            if (!visited[i]){
                topologicalSortUtil(i, visited, stack);
            }
        }

        stack.push(v);
    }

    public void topologicalSort(){
        Stack<Integer> stack = new Stack<Integer>();

        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++){
            visited[i] = false;
        }

        for (int i = 0; i < V; i++){
            if (visited[i] == false){
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (stack.empty() == false){
            System.out.print(stack.pop() + " ");
        }
    }

}
