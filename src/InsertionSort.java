public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        printArray(arr);

        insertionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}

// 12, 11, 13, 5, 6
/*
* i = 1, key = 11, j = 0  - 12>11 - arr[1] = 12
* 12 12 13 5 6 arr[0] = key - 11, 12, 13,5, 6
* i=2, key =13, j = 1, arr[2] = 13  - 11,12,13,5,6
* i=3, key =5, j=2, arr[2] = 13 - 5,11,12,13,6
* i=4, key = 6, j = 3, arr[3] = 13, - 5,6,11,12,13
*
*
*
* */
