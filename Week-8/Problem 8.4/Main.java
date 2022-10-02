import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Java program to check if there is exist a path between
// two vertices of an undirected graph.
public class Graph {

  int V; // No. of vertices

  // Pointer to an array containing adjacency lists
  ArrayList<ArrayList<Integer>> adj;

  Graph(int V) {
    this.V = V;
    adj = new ArrayList<>();
    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());
  }

  // function to add an edge to graph
  void addEdge(int v, int w) {
    adj.get(v).add(w);
    adj.get(w).add(v);
  }

  // A BFS based function to check whether d is reachable from s.
  boolean isReachable(int s, int d) {
    // Base case
    if (s == d)
      return true;

    // Mark all the vertices as not visited
    boolean[] visited = new boolean[V];
    for (int i = 0; i < V; i++)
      visited[i] = false;

    // Create a queue for BFS
    Queue<Integer> queue = new LinkedList<>();

    // Mark the current node as visited and enqueue it
    visited[s] = true;
    queue.add(s);

    while (!queue.isEmpty()) {
      // Dequeue a vertex from queue and print it
      s = queue.remove();

      // Get all adjacent vertices of the dequeued vertex s
      // If a adjacent has not been visited, then mark it
      // visited and enqueue it
      for (int i = 0; i < adj.get(s).size(); i++) {

        // If this adjacent node is the destination node,
        // then return true
        if (adj.get(s).get(i) == d)
          return true;

        // Else, continue to do BFS
        if (!visited[adj.get(s).get(i)]) {
          visited[adj.get(s).get(i)] = true;
          queue.add(adj.get(s).get(i));
        }
      }
    }

    // If BFS is complete without visiting d
    return false;
  }

  public static void main(String[] args) {

    Graph g = new Graph(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    int u = 1, v = 3;
    if (g.isReachable(u, v))
      System.out.println("\n There is a path from " + u + " to " + v);
    else
      System.out.println("\n There is no path from " + u + " to " + v);

  }

}
