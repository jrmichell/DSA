package algorithms;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // Go until every possible location is checked or if mid is found
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // return index if target found
            }

            if (arr[mid] > target) {
                high = mid - 1; // Set high to mid and iterate down
            } else {
                low = mid + 1; // Set low to mid and iterate up
            }
        }

        return -1; // return -1 if target not found
    }
}
