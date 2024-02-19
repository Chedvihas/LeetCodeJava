public class Main {
    public static void main(String[] args) {
        // Good!
        int foo = 9;
        int bar = foo;
        //modifying bar
        System.out.println("Before modifying: " + bar);
        bar = 10;
        System.out.println("After modifying: " + bar);
        // Bad!
        int[] blah = {3, 4, 5};
        int[] halb = blah;

        // Modify the array through one variable
        blah[0] = 10;

        // Print values to see the output
        System.out.println("foo: " + foo);
        System.out.println("bar: " + bar);
        System.out.println("blah[0]: " + blah[0]);
        System.out.println("halb[0]: " + halb[0]);
    }
}
