import java.util.LinkedList;

// Node class for chaining
class Node1 {
    int key;
    Node1 next;

    public Node1(int key) {
        this.key = key;
        this.next = null;
    }
}

// Hash table class with chaining for collision resolution
class HashTable {
    int size;
    LinkedList<Node1>[] table;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return (2 * key + 3) % size;
    }

    // Add element to hash table
    public void add(int key) {
        int index = hash(key);
        table[index].add(new Node1(key));
    }

    // Print hash table contents
    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node1 node : table[i]) {
                System.out.print(node.key + " -> ");
            }
            System.out.println("null");
        }
    }
}

public class Chaining {
    public static void main(String[] args) {
        // Create hash table with size 10
        HashTable hashTable = new HashTable(10);

        // Elements to be stored in hash table
        int[] elements = {3, 2, 9, 6, 11, 13, 7, 12};

        // Add elements to hash table
        for (int element : elements) {
            hashTable.add(element);
        }

        // Print hash table contents
        hashTable.printTable();
    }
}
