public class _08_row_wise_sum {
    public static int solution(int mat[][],int a){
        int sum = 0;
            for (int j= 0;j<mat[0].length;j++){
                sum = sum + mat[a][j];
        }
            return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3,2},
                {3,4,2,3},
                {2,4,1,2},
                {2,4,2,3} //this is third row and sum of this row is 11
        };
        int row = 3;
        int x=solution(matrix,row);
        System.out.println("sum is : "+  x);

    }
}
