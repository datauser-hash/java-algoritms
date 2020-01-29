package data_structure.aa_arrays_and_big_O_notation;

import java.util.Arrays;

public class AA_arrays {

    public static void main(String[] args) {
        int[] intArray = new int[7];


        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = 22;

        // get index of element with value 7,  time complexity is O(n)
        int indexOfSeven = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                indexOfSeven = i;
                break;
            }
        }



        System.out.println("index = " + indexOfSeven);
        for (int i = 0; i < intArray.length - 1; i++) {
            intArray[i] = intArray[i + 1];
        }

        System.out.println(Arrays.toString(intArray));
    }
}
