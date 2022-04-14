package Algorithms;

public class BinarySearchTree {
    Nodes root;

    public void insert(Nodes nodes) {
        root = insertHelper(root, nodes);
    }

    private Nodes insertHelper(Nodes root, Nodes nodes) {
        int data = nodes.data;
        if (root == null) {
            root = nodes;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, nodes);

        } else {
            root.right = insertHelper(root.right, nodes);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Nodes root) {

        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Nodes root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);

        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);

        } else {
            System.out.println(data + " could not be found");
        }
    }

    private Nodes removeHelper(Nodes root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else { //node found
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }

        }
        return root;
    }


    private int successor(Nodes root) {
        root = root.right;
        while(root.left!=null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Nodes root) {
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

}

class Nodes {
    int data;
    Nodes left;
    Nodes right;

    public Nodes(int data) {
        this.data = data;
    }
}
