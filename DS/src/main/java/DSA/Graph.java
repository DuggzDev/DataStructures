package DSA;



import java.util.ArrayList;
import java.util.LinkedList;
//Adjacency Matrix
public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;
Graph(int size){
matrix = new int[size][size];
nodes = new ArrayList<>();
}
public void addNode(Node node){
nodes.add(node);
}
public void addEdge (int src, int dst){
        matrix[src][dst] = 1;
}
public boolean checkEdge(int src, int dst){

   return matrix[src][dst] == 1;

}
public void print(){
    System.out.print("  ");
    for(Node n : nodes){
        System.out.print(n.data + " ");
    }
    System.out.println();
for(int i = 0; i < matrix.length; i++){
    System.out.print(nodes.get(i).data + " ");
    for(int x = 0; x < matrix[i].length;x++){
        System.out.print(matrix[i][x] + " ");
    }
    System.out.println();
}
}
}
class Node{
    char data;
    Node(char data){
        this.data = data;
    }
}
/*Graph graph = new Graph(5);
graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);
        graph.print();
            System.out.println(graph.checkEdge(0,3));


 */