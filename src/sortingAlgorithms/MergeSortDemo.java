package sortingAlgorithms;

import java.util.Arrays;

public class MergeSortDemo {
//    public void swap(int[] arr, int a, int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//
//    public void merge(int[] mergeArray, int leftIndex, int midIndex, int rightIndex) {
//
//        if (mergeArray[leftIndex] > mergeArray[midIndex]) {
//            swap(mergeArray, leftIndex, rightIndex);
//        }
//
//        if (mergeArray[rightIndex] < mergeArray[midIndex]) {
//            swap(mergeArray, midIndex, rightIndex);
//        }
//
//    }
//
//    public void sort(int[] mergeArray, int leftIndex, int rightIndex) {
//        if (leftIndex < rightIndex) {
//            int midIndex = (leftIndex + rightIndex) / 2;
//
//            sort(mergeArray, leftIndex, midIndex);
//            sort(mergeArray, midIndex + 1, rightIndex);
//            merge(mergeArray, leftIndex, midIndex, rightIndex);
//        }
//    }
//
//
//    public static void main(String args[]) {
//        int arr[] = {12, 11, 13, 5, 6, 7};
//
//        MergeSortDemo ob = new MergeSortDemo();
//        ob.sort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
////        System.out.println(Arrays.toString(ob.sort(arr, 0, arr.length)));
//    }



    void apple(int[] array){
        array[0] = 0;
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        MergeSortDemo ob = new MergeSortDemo();
        ob.apple(arr);


        for (int i = 0;i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
