package preparation;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;

public class IsCyclicGraph {

    static class MyGraph {
        private int V;
        private LinkedList[] adj;

        public MyGraph(int v) {
            V = v;
            adj = new LinkedList[v];
            for(int i=0;i<v;i++) {
                adj[i] = new LinkedList();
            }
        }

        public void addEdge(int u, int v) {
            adj[u].add(v);
        }

        public boolean isCyclicConnected(int s, boolean visited[]) {

            int []parents = new int[V];
            Arrays.fill(parents, -1);

            Queue<Integer> queue = new LinkedList();

            //Adding first element and make visited as true
            queue.add(s);
            visited[s] = true;

            while(queue.size() != 0) {
                int u = queue.poll();
                for(int i=0; i<adj[u].size(); i++) {
                    int v = (int) adj[u].get(i);
                    if (!visited[v]) {
                        visited[v] = true;
                        queue.add(v);
                        parents[v] = u;
                    } else if(parents[u] != v)
                        return true;
                }
            }
            //end of while loop

            return false;
        }

        public boolean isCyclicDisconnected() {
            boolean visited[] = new boolean[V];
            Arrays.fill(visited, false);

            for(int i=0;i<V;i++) {
                if(!visited[i] && isCyclicConnected(i, visited))
                    return true;
            }
            return false;
        }
    }


    public static void main(String[] args) {

        MyGraph m = new MyGraph(4);
        //m.m.addEdge(2,2);

        m.addEdge(0, 1);
        m.addEdge(1, 1);
        m.addEdge(2, 0);
        m.addEdge(2, 3);

        if(m.isCyclicDisconnected()) {
            System.out.println("There is a cycle present in the graph");
        } else {
            System.out.println("No cycle present in the graph");
        }
    }


}
