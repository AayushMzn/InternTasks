package sortingAlgorithms;

import java.util.Arrays;

public class QuickSortDemo {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void quickSort(int[] arr, int startIndex, int endIndex) {
        int s = startIndex;
        int e = endIndex;
        int pivot = arr[startIndex];
        int pivotIndex = startIndex;


        // find the index of the first number that is greater or equal to pivot number.
        for (int i = startIndex + 1; i < endIndex; i++) {
            if (arr[i] >= pivot) {
                startIndex = i;
                break;
            } else {
                startIndex = endIndex;
            }
        }

        //find the index of the last number that is smaller or equal to pivot number.
        for (int i = endIndex; i >= startIndex; i--) {
            if (arr[i] <= pivot) {
                endIndex = i;
                break;
            }
        }

        //swap startElement and endElement if they have not crossed each other
        //recall quickSort and repeat the process
        if (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            quickSort(arr, 0, arr.length - 1);
        }

        //swap pivot and endNumber if the startIndex and endIndex cross each other
        //partition of the array and recall quickSort for sub array;
        if (startIndex > endIndex) {
            swap(arr, pivotIndex, endIndex);
            if (s < e) {
                quickSort(arr, 0, endIndex - 1);
                quickSort(arr, endIndex + 1, arr.length - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 75, 9, 65, 1, 100, 8, 40, 11};

        QuickSortDemo qsd = new QuickSortDemo();
        qsd.quickSort(a, 0, a.length - 1);

        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
