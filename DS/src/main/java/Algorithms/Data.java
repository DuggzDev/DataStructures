package Algorithms;

public class Data {


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Nodes(1));
        tree.insert(new Nodes( 5));
        tree.insert(new Nodes(7));
        tree.insert(new Nodes( 5));
        tree.insert(new Nodes(9));
        tree.insert(new Nodes( 3));


        tree.remove(1);
        tree.display();
    }
}
