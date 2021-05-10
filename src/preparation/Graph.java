package preparation;

import java.util.*;

public class Graph {

    private int V;
    private LinkedList<Integer>[] adj;

    public Graph(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }


    public void DFS(int s) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        DFSUtil(s, visited);

        System.out.println();
    }

    private void DFSUtil(int s, boolean[] visited) {
        visited[s] = true;

        System.out.print(s + " ");

        Iterator<Integer> itr = adj[s].listIterator();
        while(itr.hasNext()) {
            int node = itr.next();
            if(!visited[node]){
                DFSUtil(node, visited);
            }
        }

    }

    //s is the source
    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;

        while(queue.size() != 0) {
            int node = queue.peek();
            System.out.print(node + "-> ");
            Iterator<Integer> itr = adj[node].listIterator();
            queue.remove();
            while(itr.hasNext()) {
                int currentNode = itr.next();
                if(!visited[currentNode]) {
                    queue.add(currentNode);
                    System.out.print(currentNode + " ");
                    visited[currentNode] = true;
                }
            }
            System.out.println();
        }
    }

    public boolean isReachable(int s, int d) {

        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);
        visited[s] = true;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);

        while(queue.size() != 0) {
            int node = queue.poll();
            Iterator<Integer> itr = adj[node].listIterator();
            while(itr.hasNext()) {
                int current = itr.next();
                if(!visited[current]){
                    if(current == d)
                        return true;
                    else {
                        queue.add(current);
                        visited[current] = true;
                    }
                }
            }
        }

        return false;
    }

    public void shortestPathBetweenTwoNodesInGraph(int s, int d) {

        int dist[] = new int[V];
        int pred[] = new int[V];

        if(!BFSToCheckIfAPathIsPresent(s,d, dist, pred)) {
            System.out.println("No path is found between the two nodes " + s + " and " + d);
            return;
        }

        LinkedList<Integer> path = new LinkedList<>();
        int crawl = d;
        path.add(crawl);

        while(pred[crawl] != -1){
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        System.out.println("Shortest path : " + dist[d]);
        System.out.println("Path between " + s + " and " + d);
        for(int i=0;i<path.size();i++) {
            System.out.print(path.get(i) + " ");
        }

    }

    private boolean BFSToCheckIfAPathIsPresent(int s, int d, int[] dist, int[] pred){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        //Initialize all the supporting arrays
        Arrays.fill(visited, false);
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(pred, -1);

        //Setting up for the source
        queue.add(s);
        visited[s] = true;
        dist[s] = 0;

        //Find out the path from source to destination
        while(queue.size() > 0) {
            int node = queue.remove();

            Iterator<Integer> itr = adj[node].listIterator();
            while(itr.hasNext()) {
                int current = itr.next();
                if(!visited[current]){
                    dist[current] = dist[node] + 1;
                    pred[current] = node;
                    queue.add(current);

                    if(current == d)
                        return true;
                }
            }
        }

        return false;

    }


    public static void main(String ... args) {
        Graph g = new Graph(8);

        g.addEdge( 0, 1);
        g.addEdge( 0, 3);
        g.addEdge( 1, 2);
        g.addEdge( 3, 4);
        g.addEdge( 3, 7);
        g.addEdge( 4, 5);
        g.addEdge( 4, 6);
        g.addEdge( 4, 7);
        g.addEdge( 5, 6);
        g.addEdge( 6, 7);


        int startNode = 0;
        System.out.println("BFS traversal of the graph starting from point :" + startNode);
        g.BFS(startNode);

        g.DFS(0);

        System.out.println(g.isReachable(0, 5));

        g.shortestPathBetweenTwoNodesInGraph(0, 7);

    }

}
