import java.util.Scanner;

public class GraphMatrix {

    private int[][] matrix; // matriz de adjacência
    private int numVertices; // número de vértices no grafo

    // construtor do objeto GraphMatrix
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        this.matrix = new int[numVertices][numVertices];
    }

    // adiciona uma aresta no grafo
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1; // para grafos não-direcionados
    }

    // imprime a matriz de adjacência do grafo
    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de vértices no grafo: ");
        int numVertices = scanner.nextInt();
        
        GraphMatrix graph = new GraphMatrix(numVertices);
        
        System.out.print("Digite o número de arestas no grafo: ");
        int numEdges = scanner.nextInt();
        
        for (int i = 0; i < numEdges; i++) {
            System.out.print("Digite a origem e o destino da aresta " + (i+1) + ": ");
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }
        
        System.out.println("Matriz de adjacência do grafo:");
        graph.printMatrix();
        
        scanner.close();
    }
}