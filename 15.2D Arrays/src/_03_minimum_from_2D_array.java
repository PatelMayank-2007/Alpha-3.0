import java.util.Scanner;

public class _03_minimum_from_2D_array {
        public static int minimum_2D(int mtx[][]){
            int min=99999;
            for(int i=0;i<mtx.length;i++){
                for(int j=0;j<mtx[0].length;j++){
                    if(mtx[i][j]<=min){
                        min=mtx[i][j];
                    }
                }
            }
            System.out.println("the minimum value is "+min);
            return 0;

        }


        public static void main(String[] args) {

            int matrix[][]=new int[3][3];
            Scanner M = new Scanner(System.in);
            int n= matrix.length;
            int m=matrix[0].length;


            //input
            System.out.print("Enter the elements:");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
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
            minimum_2D(matrix);
        }
    }


