package data_structure.CODE_EXERSISES;

public class BinaryRepresentationWithRecursion {

    public static void main(String[] args) {
        int number = 10;
        printBinOneToN(number);

    }

    private static void printBinOneToN(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(getBinaryArray(i));
        }
    }

    private static int getBinaryArray(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 2 + 10 * getBinaryArray(n / 2);
    }

}
