public class ShellSort {
    public static void shellSort(int[] array) {
        int n = array.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already in gapped order
            // keep adding one more element until the entire array is gap sorted
            for (int i = gap; i < n; i++) {
                // Add a[i] to the elements that have been gap sorted
                // save a[i] in temp and make a hole at position i
                int temp = array[i];

                // Shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Put temp (the original a[i]) in its correct location
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 3, 9, 1, 6, 0, 2, 7, 4};
        shellSort(array);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
