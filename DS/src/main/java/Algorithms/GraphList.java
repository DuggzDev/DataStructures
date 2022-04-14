package Algorithms;

import Algorithms.Node;
import DataStructures.Setz;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphList  {
    ArrayList<LinkedList<Node>> alist;

    GraphList(){

        alist = new ArrayList<>();

    }
    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
        }

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }
    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }


    public void print(){
     String arrow = " -> ";
        for(LinkedList<Node> currentList: alist){
            for(Node node: currentList){
                System.out.print(node.data + arrow);
                if(currentList.isEmpty()){
                    System.out.println(arrow.replace(node.data, ' '));
                }

            }

            System.out.println();
        }
    }
}
/* GraphList graphList = new GraphList();
graphList.addNode(new Node('A'));
        graphList.addNode(new Node('B'));
        graphList.addNode(new Node('C'));
        graphList.addNode(new Node('D'));
        graphList.addNode(new Node('E'));
            graphList.addNode(new Node('F'));

        graphList.addEdge(0,1);
        graphList.addEdge(1,2);
        graphList.addEdge(1,4);
        graphList.addEdge(2,3);
        graphList.addEdge(2,4);
        graphList.addEdge(4,0);
        graphList.addEdge(4,2);
        graphList.addEdge(3,2);
        graphList.addEdge(5,0);

        graphList.print();
*/
