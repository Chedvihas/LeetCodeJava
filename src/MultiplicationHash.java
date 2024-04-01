public class MultiplicationHash {
    public static int hash(int key, int tableSize) {
        double A = 0.618; // typically chosen constant
        double hashValue = key * A; //25.9 - 25 = 0.918
        hashValue -= (int) hashValue; // extract fractional part
        return (int) (tableSize * hashValue); // 9.18 //9
    }

    public static void main(String[] args) {
        int key = 42;
        int tableSize = 10;
        int hashValue = hash(key, tableSize);
        System.out.println("Hash value for key " + key + ": " + hashValue);
    }
}
