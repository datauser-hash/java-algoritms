package data_structure.ab_sorting_algorithms.insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 35, -15, 7, 55, 1, -22};
//        sortArray(arr);
        recursiveInsertSort(arr, arr.length);
        printArray(arr);
    }


    private static void sortArray(int[] data) {
        // From 1 to n
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < data.length; firstUnsortedIndex++) {
            int newElement = data[firstUnsortedIndex];
            int i;
            // Right to left
            for (i = firstUnsortedIndex; i > 0 && data[i - 1] > newElement; i--) {
                data[i] = data[i - 1];
            }
            data[i] = newElement;
        }
    }


    private static void recursiveInsertSort(int[] data, int n) {
        if (n == 1) {
            return;
        }
        recursiveInsertSort(data, n - 1);
        int lastItem = data[n - 1];
        int j = n - 2;
        while (j >= 0 && data[j] > lastItem) {
            data[j + 1] = data[j];
            j--;
        }
        data[j + 1] = lastItem;

    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int value : arr) {
            System.out.print(value + " ,");
        }
        System.out.print("]");
    }
}
