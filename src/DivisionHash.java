public class DivisionHash {
    public static int hash(int key, int tableSize) {
        return key % tableSize;
    }

    public static void main(String[] args) {
        int key = 55;
        int tableSize = 10;
        int hashValue = hash(key, tableSize);
        System.out.println("Hash value for key " + key + ": " + hashValue);
    }
}
//2,42 H[2]  = 42
//5,45 H[5]  = 45

//55

//2,42
//5,45
//5,55
//