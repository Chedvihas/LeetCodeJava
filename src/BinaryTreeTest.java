public class BinaryTreeTest {
    public static void main(String[] args) {
        // Create a sample binary tree
        Node<Integer, String> root = new Node<>(10, "Root", 1);
        root.left = new Node<>(5, "Left", 1);
        root.right = new Node<>(15, "Right", 1);
        root.left.left = new Node<>(3, "LeftLeft", 1);
        root.left.right = new Node<>(7, "LeftRight", 1);
        root.right.left = new Node<>(12, "RightLeft", 1);
        root.right.right = new Node<>(18, "RightRight", 1);

        // Test the isBST method
        boolean isBST = isBST(root);
        System.out.println("Is the tree a BST? " + isBST);
    }

    private static boolean isBST(Node<Integer, ?> root) {
        return isBSTUtil(root, null, null);
    }

    private static boolean isBSTUtil(Node<Integer, ?> node, Object min, Object max) {
        if (node == null) return true;

        if ((min != null && node.key.compareTo((Integer) min) <= 0) ||
                (max != null && node.key.compareTo((Integer) max) >= 0)) {
            return false;
        }

        return isBSTUtil(node.left, min, node.key) && isBSTUtil(node.right, node.key, max);
    }

    private static class Node<Key extends Comparable<Key>, Value> {
        public final Key key;
        public Value val;
        public Node<Key, Value> left, right;
        public int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }
}
