// Node class representing each node in the BST
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// BST class with insert, search, and print methods
class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Method to insert a key into the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a key into the BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, traverse the tree to find the appropriate position
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Method to search for a key in the BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Recursive method to search for a key in the BST
    boolean searchRec(Node root, int key) {
        // If the tree is empty or the key is at the root
        if (root == null || root.key == key) {
            return root != null;
        }

        // If the key is less than the root's key, search in the left subtree
        if (key < root.key) {
            return searchRec(root.left, key);
        }
        // If the key is greater than the root's key, search in the right subtree
        else {
            return searchRec(root.right, key);
        }
    }

    // Method to print the representation of the BST
    void printTree() {
        printTreeRec(root, "");
    }

    // Recursive method to print the representation of the BST
    void printTreeRec(Node root, String prefix) {
        if (root != null) {
            System.out.println(prefix + "└── " + root.key);
            printTreeRec(root.left, prefix + "    │");
            printTreeRec(root.right, prefix + "    ");
        }
    }
}

// Main class to demonstrate BST operations and printing
public class BST_main {
    public static void main(String[] args) {
        BST bst = new BST();

        // Inserting keys into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.insert(25);
        bst.insert(15);


        // Printing the representation of the BST
        System.out.println("BST representation:");
        bst.printTree();
        System.out.println("40 in Tree? "+ bst.search(40));
    }
}
