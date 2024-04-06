// Node class for linear probing
class Node2 {
    int key;

    public Node2(int key) {
        this.key = key;
    }
}

// Hash table class with linear probing for collision resolution
class HashTableLinearProbing {
    int size;
    Node2[] table;

    public HashTableLinearProbing(int size) {
        this.size = size;
        table = new Node2[size];
    }

    // Hash function
    private int hash(int key) {
        return (2 * key + 3) % size;
    }

    // Add element to hash table with linear probing
    public void add(int key) {
        int index = hash(key);
        while (table[index] != null) {
            index = (index + 1) % size; // Linear probing
        }
        table[index] = new Node2(key);
    }

    // Print hash table contents
    public void printTable() {
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.println("Index " + i + ": " + table[i].key);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }
}

public class LinearProbing {
    public static void main(String[] args) {
        // Create hash table with size 10
        HashTableLinearProbing hashTable = new HashTableLinearProbing(10);

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
