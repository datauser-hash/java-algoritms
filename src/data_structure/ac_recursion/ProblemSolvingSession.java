package data_structure.ac_recursion;

public class ProblemSolvingSession {

    public static void main(String[] args) {
        int sumOfNumber = sum(100);
        System.out.println(sumOfNumber);

        printNumbers(3);

        int power = powerAtoB(6, 4);
        System.out.println(power);

        power = powerAtoBAmmended(6, 4);
        System.out.println(power);

    }
//====================================================================================================================


    /**
     * Recursive function to sum up numbers untill n
     * @param n given n number
     * @return the sum
     */
    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            int sum_prev = sum(n - 1);
            return sum_prev + n;
        }
    }
//====================================================================================================================


    /**
     * Write a program take n and print all element until n
     *
     */
    private static void printNumbers(int n) {
        if (n == 1) {
            System.out.println(n);
        }
        else {
            printNumbers(n - 1);
            System.out.println(n);

        }
    }
//====================================================================================================================


    /**
     * Calculate a^b a,b are integers with recursion
     */
    private static int powerAtoB(int a, int b) {
        if (b == 1) {
            return a;
        }
        else {
            return a * powerAtoB(a, b - 1);
        }
    }


    /**
     * The same as above with log_n complexity

     */
    private static int powerAtoBAmmended(int a, int b) {
        if (b == 1) {
            return a;
        }
        else if (b % 2 == 0) {
            int x = powerAtoBAmmended(a, b / 2);
            return x * x;
        }
        else {
            int x = powerAtoBAmmended(a, b / 2);
            return x * x * a;
        }

    }

}


