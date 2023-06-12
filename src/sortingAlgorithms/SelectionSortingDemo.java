package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSortingDemo {
    public static int[] swap(int[] tempArr, int i) {
        int temp = tempArr[i];
        tempArr[i] = tempArr[i + 1];
        tempArr[i + 1] = temp;
        return tempArr;
    }

    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        while (n > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr = swap(arr, i);
                }
            }
            n--;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSortingDemo ssd = new SelectionSortingDemo();
        System.out.println(Arrays.toString(ssd.selectionSort(new int[]{10, 5, 75, 9, 65, 1, 100, 0})));
    }
}
