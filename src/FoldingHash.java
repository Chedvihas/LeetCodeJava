public class FoldingHash {
    public static int hash(int key, int tableSize) {
        String keyString = Integer.toString(key);
        int hashValue = 0;
        for (int i = 0; i < keyString.length(); i += 2) {
            int part = Integer.parseInt(keyString.substring(i, Math.min(i + 2, keyString.length())));
            hashValue += part;
        }
        return hashValue % tableSize;
    }

    public static void main(String[] args) {
        int key = 123456789;
        int tableSize = 10;
        int hashValue = hash(key, tableSize);
        System.out.println("Hash value for key " + key + ": " + hashValue);
    }
}
