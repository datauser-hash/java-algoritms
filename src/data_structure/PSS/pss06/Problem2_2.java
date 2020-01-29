package data_structure.PSS.pss06;


public class Problem2_2 {

    public static void main(String[] args) {
        int[][] matrix = creatNXNMatrix(7);
        printMatix(matrix);
        System.out.println("Rotating...");
        rotate(matrix);
        printMatix(matrix);
    }

    private static void rotate(int[][] matrix) {
        int N = matrix.length;

        for (int row=0; row<(N+1)/2; row++) {
            for (int col=0; col<N/2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[N-1-col][row];
                matrix[N-1-col][row] = matrix[N-1-row][N-1-col];
                matrix[N-1-row][N-1-col] = matrix[col][N-1-row];
                matrix[col][N-1-row] = temp;
            }
        }
    }


    private static int[][] creatNXNMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                matrix[i][j] = j + 1;
            }
        }
        return matrix;
    }

    private static void printMatix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
