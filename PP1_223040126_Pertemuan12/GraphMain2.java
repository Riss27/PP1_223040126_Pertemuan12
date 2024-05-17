public class GraphMain2 {
    public static void main(String[] args) {
        Graph theGraph = new Graph(4);
        
        // Menambahkan vertex
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        
        // Menambahkan edge sesuai gambar
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(0, 2); // AC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(1, 3); // BD
    
        theGraph.adjacencyMatrix();
    }
}
