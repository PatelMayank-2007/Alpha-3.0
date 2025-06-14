import java.util.*;
import java.util.Scanner;
public class _01_Creation_of_2D_array {
    public static boolean search(int mtx[][],int x){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the element to found the index:");
        x= sc.nextInt();
        for(int i=0;i<mtx.length;i++){
            for(int j=0;j<mtx[0].length;j++){
                if(mtx[i][j] == x){
                    System.out.println("the key is found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner M = new Scanner(System.in);
        int n= matrix.length;
        int m=matrix[0].length;

        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter the elements:");
                matrix[i][j]= M.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,5);
    }
}
