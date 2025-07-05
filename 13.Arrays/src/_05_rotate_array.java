public class _05_rotate_array {
    public static int[] rotate(int matrix[],int k){
        for(int i = 1;i<=k;i++){
            for (int j = 0;j<=matrix.length;j++){
                if(matrix[j] != matrix[matrix.length-1]) {
                    matrix[j + 1] = matrix[j];
                }
                else{
                    matrix[j]=matrix[matrix.length-1];
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int matrix[] = {1,2,3,4,5,6,7};
        int key = 3;
        int[] y =rotate(matrix,key);
        System.out.println(y);
    }
}
