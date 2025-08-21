import java.util.*;

public class _04_Spiral_matrix {
    public static void print_spiral(int mat[][]) {

        int start_row = 0;
        int end_row = mat.length - 1;
        int start_col = 0;
        int end_col = mat[0].length - 1;
        while (/*start_row <= end_row && start_col <= end_col*/ true) {
            //top
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(mat[start_row][j] + " ");
            }
            //right
            for (int i = start_row+1; i <= end_row; i++) {
                System.out.print(mat[i][end_col] + " ");
            }
            //botttom
            for (int k = end_col - 1; k >= start_col; k--) {
                System.out.print(mat[end_row][k] + " ");
            }
            //left
            for (int l = end_row - 1; l > start_row; l--) {
                System.out.print(mat[l][start_col] + " ");
            }


            start_col++;
            start_row++;
            end_col--;
            end_row--;

        }

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 209}};
        print_spiral(matrix);
    }
}
