package data_structure.ab_sorting_algorithms.selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 35, -15, 7, 55, 1, -22};
        sortArray(arr);
        printArray(arr);

    }

    private static void sortArray(int[] data) {
        int n = data.length;
        for (int firstMinIndex = 0; firstMinIndex < n; firstMinIndex++) {
            int floatingMinIndex = firstMinIndex;
            for (int indexOfNext = firstMinIndex + 1; indexOfNext < n; indexOfNext++) {
                if (data[indexOfNext] < data[floatingMinIndex]) {
                    floatingMinIndex = indexOfNext;
                }
            }
            swap(data, firstMinIndex, floatingMinIndex);
        }
    }


    private static void swap (int [] data, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");;
        }
        System.out.print("]");
    }
}
