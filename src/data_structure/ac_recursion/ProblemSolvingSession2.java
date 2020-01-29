package data_structure.ac_recursion;

public class ProblemSolvingSession2 {

    private static int counter;

    public static void main(String[] args) {
        System.out.println(countOf11("11211", 0));
        System.out.println(countOf11("111", 0));
        System.out.println(countOf11("213113110", 0));
        System.out.println("=====================================================================");


        String s = "abcexexdd";
        StringBuilder stringBuilder = new StringBuilder(s);
        pushXtoEnd(s, 0, stringBuilder, 0);
        s = stringBuilder.toString();
        System.out.println(s);
        System.out.println("=====================================================================");


        System.out.println(sumOfHarmonic(9));


        System.out.println(stringToInteger("13531", 0));

    }



    private static int countOf11(String s, int start) {
        if (s.length() - start < 2) {
            return 0;
        }
        if (s.charAt(start) == '1' && s.charAt(start + 1) == '1'){
            return 1 + countOf11(s, start + 2);
        }
        else {
            return countOf11(s, start + 1);
        }
    }


    private static void pushXtoEnd(String s, int start, StringBuilder sb, int xNum) {
        if (start == s.length()) {
            // Put counted 'x' (s) to the end
            for (int i = 0; i < xNum; i++) {
                sb.append('x');
            }
        }
        else {
            // Process next character
            if (s.charAt(start) == 'x') {
                pushXtoEnd(s, start + 1, sb, xNum + 1);
            }
            else {
                sb.append(s.charAt(start));
                pushXtoEnd(s, start + 1, sb, xNum);
            }
        }
    }


    private static double sumOfHarmonic(int n) {

        if (n == 1) {
            return 1;
        }

        else {
            return 1 / (double) n + sumOfHarmonic(n - 1);
        }
    }

    private static int stringToInteger(String s, int start) {
        if (s.length() - 1 == start) {
            return 1;
        }
        else {
            int hondreds = (int) Math.pow(10, s.length());
            return (s.charAt(start) - '0') * hondreds + stringToInteger(s.substring(start + 1), start);
        }
    }



}
