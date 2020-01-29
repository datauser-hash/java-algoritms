package data_structure.ab_sorting_algorithms.quick_sort;

import java.util.Arrays;

/**
 * To sort a sequence S with n elements, quick sort does:

        1.  Divide: If |S| ≤ 1, return S.

            Otherwise, select element x (called pivot, commonly the last element in S) and partition S into:
                     * L elements less than x
                     * E elements equal to x
                     * G elements greater than x

        2. Conquer: Recursively sort sequences L and G

        3. Combine: Join L, E and G
 */
public class QuickSortRecursive {

    public static void main(String[] args) {
        int[] S = new int[] {1, 3, 6, 9, 11, 0, 2, 7, 10, 11, 5, 7, 9, 12, 34, 50};
        recursiveQuickSort(S, 0, S.length - 1);
        System.out.println("Sorted array with recursion: " + Arrays.toString(S));
    }



    /**
     * Recursive quicksort logic
     *
     * @param array input array
     * @param startIdx start index of the array
     * @param endIdx end index of the array
     */
    private static void recursiveQuickSort(int[] array, int startIdx,
                                          int endIdx) {

        int idx = partition(array, startIdx, endIdx);

        // Recursively call quicksort with left part of the partitioned array
        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }

        // Recursively call quick sort with right part of the partitioned array
        if (endIdx > idx) {
            recursiveQuickSort(array, idx, endIdx);
        }
    }


    /**
     * Divides array from pivot, left side contains elements less than
     * Pivot while right side contains elements greater than pivot.
     *
     * @param array array to partitioned
     * @param left lower bound of the array
     * @param right upper bound of the array
     * @return the partition index
     */
    public static int partition(int[] array, int left, int right) {
        int pivot = array[(int)(Math.random() * array.length)]; // randomly taken pivot

        while (left <= right) {
            //searching number which is greater than pivot, bottom up
            while (array[left] < pivot) {
                left++;
            }
            //searching number which is less than pivot, top down
            while (array[right] > pivot) {
                right--;
            }

            // swap the values
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                //increment left index and decrement right index
                left++;
                right--;
            }
        }
        return left;
    }
}

