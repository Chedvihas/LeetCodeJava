import java.util.*;

public class SplitInteger {
    public int minSum(int num) {
        String digits = String.valueOf(num);
        char[] numArray = digits.toCharArray();
        //6543
        //"6543"

        // 6543 - 6,5,4,3
        // 6543 - [6,5,4,3] - > [3,4,5,6]
        //[34,56]
        //[90]
        //3456

        Arrays.sort(numArray);
//"3456"
        String new1 = "";
        String new2 = "";

        // Form new1 with the smallest digits
        for (int i = 0; i < numArray.length / 2; i++) {
            new1 += numArray[i];
        }

        // Form new2 with the remaining digits
        for (int i = numArray.length / 2; i < numArray.length; i++) {
            new2 += numArray[i];
        }
        //new1 = '34'
        //new2 = '56'


        int new1Int = Integer.parseInt(new1);
        int new2Int = Integer.parseInt(new2);

        return new1Int + new2Int;
    }

    public static void main(String[] args) {
        SplitInteger splitInteger = new SplitInteger();
        int num = 2932;
        //2239 - 22, 39
        // 22 + 39
        System.out.println("Input: num = " + num);
        System.out.println("Output: " + splitInteger.minSum(num));
    }
}
