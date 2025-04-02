import algorithms.BinarySearch;
import algorithms.BubbleSort;
import algorithms.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 20, 1, 8, 6, 10, 9, 2, 7};

        BubbleSort.sort(arr);
        System.out.println("Bubble Sort: " + Arrays.toString(arr));

        SelectionSort.sort(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for in the sorted array: ");
        int target = scanner.nextInt();
        int targetLocation = BinarySearch.search(arr, target);
        if (targetLocation == -1) {
            System.out.println("The value " + target + " is not in the array.");
        } else {
            System.out.println("The value " + target + " is located at index " + targetLocation + ".");
        }
    }
}