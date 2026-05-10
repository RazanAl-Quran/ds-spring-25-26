import java.util.Arrays;

public class Graph {
    private int numVertices;
    private int[][] adjacencyMatrix;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
        // for (int i = 0; i < v; i++) {
        // for (int j = 0; j < v; j++) {
        // adjacencyMatrix[i][j]= Integer.MAX_VALUE;
        // }
        // }

        for (int i = 0; i < numVertices; i++) {
            Arrays.fill(adjacencyMatrix[i], Integer.MAX_VALUE);
        }
    }

    public void addEdge(int source, int dest, int weight) {
        adjacencyMatrix[source][dest] = weight;
        // adjacencyMatrix[dest][source] = weight; //undirected
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if(adjacencyMatrix[i][j] == Integer.MAX_VALUE) {
                    System.out.println("∞ \t");
                } else {
                     System.out.println(adjacencyMatrix[i][j] + " " +"\t");
                }
            }
        }
    }
}
