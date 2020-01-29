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
public class QuickSort {

    public static void main(String[] args) {
        int[] S = new int[] {1, 3, 6, 9, 11, 0, 2, 7, 10, 11, 5, 7, 9, 12, 34, 50};
        quickSort(S);
        System.out.println("Sorted array: " + Arrays.toString(S));
    }

    private static void quickSort(int[] S) {
        int n = S.length;

        if (n < 2) {                                // array is trivially sorted
            return;
        }

        // divide
        int pivotElement = S[n - 1];                       //  using last as arbitrary pivotElement

        int m = 0, k = n;
        int[] temp = new int[n];

        //  divide original into L, E, and G
        for (int i = 0; i < n - 1; i++) {
            if (S[i] < pivotElement) {                     //  element is less than pivotElement
                temp[m++] = S[i];
            }
            else if (S[i] > pivotElement) {                // element is greater than pivotElement
                temp[--k] = S[i];
            }
        }
        int[] L = Arrays.copyOfRange(temp, 0, m);
        int[] E = new int[k - m];
        Arrays.fill(E, pivotElement);
        int[] G = Arrays.copyOfRange(temp, k, n);


        //conquer with recursion
        quickSort(L);                               //  sort elements less than pivotElement
        quickSort(G);                               //  sort elements greater than pivotElement


        //concatenate results
        System.arraycopy(L, 0, S, 0, m);
        System.arraycopy(E, 0, S, m, k - m);
        System.arraycopy(G, 0, S, k, n - k);

    }
}
