import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: numRows = 0
        if (numRows == 0) {
            return triangle;
        }

        // First row always contains 1
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generating subsequent rows
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // The first element in each row is always 1
            row.add(1);

            // Each element (except the first and last) in each row is the sum of the elements above-left and above-right in the previous row
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last element in each row is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int numRows = 5;
        List<List<Integer>> triangle = pascalTriangle.generate(numRows);
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
