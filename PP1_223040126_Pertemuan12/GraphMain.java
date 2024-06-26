public class GraphMain {

public static void main(String[] args) {
    Graph theGraph = new Graph(5);
    // menambahkan vertex
    theGraph.addVertex('A'); // 0
    theGraph.addVertex('B'); // 1
    theGraph.addVertex('C'); // 2
    theGraph.addVertex('D'); // 3
    theGraph.addVertex('E'); // 4
    // menambahkan edge
    theGraph.addEdge(0, 1); // AB
    theGraph.addEdge(1, 2); // BC
    theGraph.addEdge(0, 3); // AD
    theGraph.addEdge(3, 4); // DE

    theGraph.adjacencyMatrix();
}
}