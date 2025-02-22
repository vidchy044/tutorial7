//vidchayada 672115044
import java.util.*;
class Graph{
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int ver1, int ver2) {

        adjList.putIfAbsent(ver1, new ArrayList<>());
        adjList.putIfAbsent(ver2, new ArrayList<>());
        adjList.get(ver1).add(ver2);
        adjList.get(ver2).add(ver1);
    }
    public void display() {
        for (Map.Entry<Integer, List<Integer>> input : adjList.entrySet()) {
            int node = input.getKey();
            List<Integer> neighbors = input.getValue();

            System.out.print("Node " + node + " is connected to [ ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

public class UndirectedMap {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(1, 5);
        graph.addEdge(3, 1);
        graph.addEdge(5, 2);
        
        graph.display();
    }
}
