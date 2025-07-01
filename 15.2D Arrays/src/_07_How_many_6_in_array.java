import java.util.*;
public class _07_How_many_6_in_array {
    public static int recurring(int mat[][],int a){
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if(mat[i][j]==a){
                    count=count+1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int Matrix[][] = {
                {1,2,3,2},
                {3,4,2,3},
                {2,4,1,2},
                {2,4,2,3}
        };
        Scanner M = new Scanner(System.in);
        System.out.println("Enter the number to find recurring of the number:");
        int y =M.nextInt();
        int x=recurring(Matrix,y);
        System.out.println("the total number of " + y + " in the given array :" + x);


    }
}
