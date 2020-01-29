package data_structure.ab_sorting_algorithms.counting_sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(arr, 1, arr.length);
        printArray(arr);
    }

    private static void countingSort(int[] data, int min, int max) {
        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < data.length; i++) {
            // Increment the exact position of i in counting array
            countArray[data[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                data[j++] = i;
                countArray[i - min]--;
            }
        }
    }


    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int value : arr) {
            System.out.print(value + " ,");
        }
        System.out.print("]");
    }
}
