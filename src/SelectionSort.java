public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) { // starts from 0 and goes till n-2 - (n-1 times)

            int minIndex = i;
    //7,3,1,9,2
            for (int j = i+1; j < n; j++) { // i+1 to n-1
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,-3, -1,0, 2, 9, 2};
        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// i = 0 -> 1 to n-1 = n-1 times
//i = 1 -> 2 to n-1 = n-2 times
//i=2 -> 3 to n-1 = n-3 times
//i=n-2 - > n-1 = 1

// n-1 + n-2 + n-3 + ..... + 3 + 2 + 1
// 1 + 2 + 3+ 4 + .... + n-3 + n-2 + n-1
//sum of first n consecutive natural numbers is n*(n+1)/2
//sum of first n-1 consecutive natural numbers is (n-1)*(n-1+1)/2
//(n-1)*n/2
//(n^2 - n)/2
// n^2 - n
// O(n^2)