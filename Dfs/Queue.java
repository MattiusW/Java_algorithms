package Dfs;

import java.util.LinkedList;

public class Queue {

    public LinkedList<Vertex> queue;
    public int size;

    public Queue(){
        this.queue = new LinkedList<>();
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(Vertex data){
        this.queue.addLast(data);
        size++;
    }
    
    public Vertex dequeue(){
        if(!this.isEmpty()){
            Vertex data = this.queue.removeFirst();
            size--;
            return data;
        }
        else{
            throw new Error("null");
        }
    }
}
