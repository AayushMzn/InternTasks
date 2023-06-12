package searchingAlgorithms;

public class BinarySearch {
    public boolean search(int[] array, int item, int low, int high) {
        int mid = (low + high) / 2;

        if (array[mid] == item) {
            return true;
        }
        if (low == high) {
            return false;
        }
        if (array[mid] < item) {
            return search(array, item, mid + 1, high);

        }
        if (array[mid] > item) {
            return search(array, item, low, mid);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.search(arr, 9, 0, arr.length - 1));
        System.out.println(binarySearch.search(arr, 5, 0, arr.length - 1));
        System.out.println(binarySearch.search(arr, 500, 0, arr.length - 1));
        System.out.println(binarySearch.search(arr, -1, 0, arr.length - 1));
    }
}
