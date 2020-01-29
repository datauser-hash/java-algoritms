package data_structure.ab_sorting_algorithms.merge_sort;

import java.util.Arrays;

/**
 * MergeSort(arr[], l,  r)
 * If r > l
 *      1. Find the middle point to divide the array into two halves:
 *              middle m = (l+r)/2
 *      2. Call mergeSort for first half:
 *              Call mergeSort(arr, l, m)
 *      3. Call mergeSort for second half:
 *              Call mergeSort(arr, m+1, r)
 *      4. Merge the two halves sorted in step 2 and 3:
 *              Call merge(arr, l, m, r)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 35, -15, 7, 55, 1, -22};
        mergeSort(arr);
        printArray(arr);
    }


    /**
     *  Merge-sort contents of array S.
     * @param s array
     */
    private static void mergeSort(int[] s) {
        int n = s.length;
        if (n < 2) {                                                // array is trivially sorted
            return;
        }

        // divide
        int mid = n / 2;

        int[] s1 = Arrays.copyOfRange(s, 0, mid);             // copy of first half
        int[] s2 = Arrays.copyOfRange(s, mid, n);                   // copy of secind half


        // conquer (with recursion)
        mergeSort(s1);
        mergeSort(s2);

        // merge results
        merge(s1, s2, s);

    }

    /**
     * Merging two arrays
     * @param s1 First sorted array
     * @param s2 Second sorted array
     * @param s An empty array
     */
    private static void merge(int[] s1, int[] s2, int[] s) {
        int i = 0, j = 0;
        while (i + j < s.length) {
            if (j == s2.length || (i < s1.length && s1[i] < s2[j])) {
                s[i + j] = s1[i++];
            }
            else {
                s[i + j]  = s2[j++];
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
