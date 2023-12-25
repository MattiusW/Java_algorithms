package studies;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    List<Node> neigbors;
    
    public Node(int value){
        this.value = value;
        this.neigbors = new ArrayList<>();
    }
}
