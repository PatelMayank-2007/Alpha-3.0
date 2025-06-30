import java.util.*;

public class _05_Diagonal_Sum_Matrix {
    public static void DiagonalSum(int mat[][]) {

        //brute force method --- time complexity 0(n^2)
//        int sum = 0;
//        for (int i=0 ; i<mat.length;i++){
//            for(int j=0;j<mat[0].length;j++) {
//                if (i == j) {
//                    sum = sum + mat[i][j];
//                }
//                else if (i+j==mat.length-1){
//                    sum=sum+mat[i][j];
//                }
//            }
//        }
//        System.out.println(sum);

        //optimized method
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            //primary diagonal
            sum = sum + mat[i][i];

            //secondary diagonal
            if (i != mat.length - i - 1) {
                sum = sum + mat[i][mat.length - i - 1];
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int matrix[][] = {  {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}    };
        DiagonalSum(matrix);

    }

}
