package data_structure.CODE_EXERSISES;

public class SumOfContiguousSubArrays {

    public static void main(String[] args) {
//        int[] arr = new int[] {1, -4, 3, 7, 9};
        int[] arr = new int[] {1,2,3,-20,28};

        int sumOfSubArray = maxOfSumOfContiguousSumArray(arr);
        System.out.println(sumOfSubArray);
    }


    // Find the maximum possible sum in data[]
    // such that data[middle] is part of it

    /**
     * Recursively detect and return the max sum of subarrays
     * @param data array
     * @param start start point
     * @param end end point
     * @param sum the current sum
     * @return sum of max of sub array
     */
    private static int getMaxOfSubArray(int[] data, int start, int end, int sum){
        if (end > data.length){
            return sum;
        }
        else if (start > end){
            return getMaxOfSubArray(data,0,end + 1, sum);
        }
        else {
            int newSum = 0;
            for (int i = start; i < end;i++){
                newSum += data[i];
            }
            if (newSum > sum) {
                sum = newSum;
            }
            return getMaxOfSubArray(data,start + 1, end, sum);
        }
    }

    /**
     * Wrapper function for getMaxOfSubArray
     * @param data array
     * @return the maximum sum of contiguous sub sub arrays
     */
    private static int maxOfSumOfContiguousSumArray(int[] data) {
        return getMaxOfSubArray(data, 0, 0, 0);
    }



}
