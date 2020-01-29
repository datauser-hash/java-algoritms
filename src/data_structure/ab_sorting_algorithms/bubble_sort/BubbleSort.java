package data_structure.ab_sorting_algorithms.bubble_sort;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 35, -15, 7, 55, 1, -22};
//        sortArray(arr);
        recursiveBubbleSort(arr, arr.length);
        printArray(arr);

    }

    private static void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void sortArray(int[] data) {
        // Outer loop from end to start that for each iteration makes unsorted partition smaller
        for (int lastUnsortedIndex = data.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            boolean swapped = false;
            // If current element at index i is greater than the value at index i+1 the swap
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void recursiveBubbleSort(int[] data, int n) {

        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i ++) {
            if (data[i] > data[i + 1]) {
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
            }
        }
        recursiveBubbleSort(data, n - 1);

    }


    private static void printArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ,");
        }
        System.out.print("]");
    }
}
