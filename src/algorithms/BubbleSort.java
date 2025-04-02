package algorithms;

public class BubbleSort {

    public static void sort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false; // reset swapped every iteration
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements and swap if condition is met
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // set to true if swap occurs
                }
            }

            // if no swap occurred, sorting is complete
            if (!swapped) {
                break;
            }
        }
    }
}
