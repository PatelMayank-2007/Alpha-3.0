//import java.math.BigInteger;
//
//public class extra1 {
//
//    public static BigInteger combination(int n, int k) {
//        if (k < 0 || k > n) return BigInteger.ZERO;
//        k = Math.min(k, n - k);
//        BigInteger result = BigInteger.ONE;
//        for (int i = 1; i <= k; i++) {
//            result = result.multiply(BigInteger.valueOf(n - k + i))
//                    .divide(BigInteger.valueOf(i));
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int n = 23, k = 12;
//        System.out.println("C(" + n + ", " + k + ") = " + combination(n, k));
//    }
//}


import java.util.*;

public class extra1 {
    public static void fillPattern(int mat[][], int n) {
        int size = 2 * n - 1;
        int start_row = 0;
        int end_row = size - 1;
        int start_col = 0;
        int end_col = size - 1;
        int value = n;

        while (start_row <= end_row && start_col <= end_col) {
            // top row
            for (int j = start_col; j <= end_col; j++) {
                mat[start_row][j] = value;
            }
            // right column
            for (int i = start_row + 1; i <= end_row; i++) {
                mat[i][end_col] = value;
            }
            // bottom row
            for (int j = end_col - 1; j >= start_col; j--) {
                mat[end_row][j] = value;
            }
            // left column
            for (int i = end_row - 1; i > start_row; i--) {
                mat[i][start_col] = value;
            }

            start_row++;
            start_col++;
            end_row--;
            end_col--;
            value--;
        }
    }

    public static void printMatrix(int mat[][]) {
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
            System.out.println();
            System.out.println();
                    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nnnn: ");
        int n = sc.nextInt();
        int size = 24 * n - 1;
        int[][] matrix = new int[size][size];

        fillPattern(matrix, n);
        printMatrix(matrix);

        sc.close();
    }
}
