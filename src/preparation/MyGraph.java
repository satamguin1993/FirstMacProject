package preparation;

import java.util.*;

public class MyGraph {

    private int V;
    private LinkedList<Integer>[] adj;

    public MyGraph(int v) {
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<>();
        }
    }



    private static void main(String... args) {
        MyGraph g = new MyGraph(5);
    }

}