import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, SymbolInfo> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    public void insert(String name, SymbolInfo info) {
        table.put(name, info);
    }

    public SymbolInfo lookup(String name) {
        return table.get(name);
    }

    public void update(String name, SymbolInfo info) {
        table.put(name, info);
    }

    public void delete(String name) {
        table.remove(name);
    }

    public boolean contains(String name) {
        return table.containsKey(name);
    }

    public int size() {
        return table.size();
    }

    public void clear() {
        table.clear();
    }

    public boolean isEmpty() {
        return table.isEmpty();
    }

    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();

        symbolTable.insert("x", new SymbolInfo("variable", "int", 0));
        symbolTable.insert("func", new SymbolInfo("function", "void", 1));

        SymbolInfo xInfo = symbolTable.lookup("x");
        if (xInfo != null) {
            System.out.println("Type of 'x': " + xInfo.getType());
        }

        System.out.println("Symbol table size: " + symbolTable.size());

        symbolTable.delete("func");

        System.out.println("Contains 'func'? " + symbolTable.contains("func"));

        symbolTable.clear();

        System.out.println("Is empty after clearing? " + symbolTable.isEmpty());
    }
}

class SymbolInfo {
    private String kind;
    private String type;
    private int address;

    public SymbolInfo(String kind, String type, int address) {
        this.kind = kind;
        this.type = type;
        this.address = address;
    }

    public String getKind() {
        return kind;
    }

    public String getType() {
        return type;
    }

    public int getAddress() {
        return address;
    }
}
