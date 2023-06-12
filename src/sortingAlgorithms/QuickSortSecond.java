package sortingAlgorithms;

import java.util.Arrays;

public class QuickSortSecond {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int cursor = startIndex - 1;
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] < pivot) {
                cursor++;
                swap(arr, i, cursor);
            }
        }
        swap(arr, cursor + 1, endIndex);
        return cursor + 1;
    }

    public void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(arr, startIndex, endIndex);

            quickSort(arr, startIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, endIndex);
        }

    }

    public static void main(String[] args) {
        int[] a = {10, 5, 75, 9, 65, 1, 100, 8, 40, 11};

        QuickSortSecond qss = new QuickSortSecond();
        qss.quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));

    }
}
