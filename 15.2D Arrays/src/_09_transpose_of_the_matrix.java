public class _09_transpose_of_the_matrix {
    public static void print(int mat[][]){
        System.out.println("the matrix is:");
        for (int i=0;i<mat.length;i++){
            for (int j =0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows=4,col=4;
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        print(matrix);

        int transpose[][] = new int[col][rows];
        for (int i=0;i<rows;i++){
            for (int j =0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        print(transpose);

    }
}
