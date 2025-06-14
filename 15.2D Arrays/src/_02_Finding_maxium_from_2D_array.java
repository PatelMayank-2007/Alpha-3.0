import java.util.Scanner;

public class _02_Finding_maxium_from_2D_array {

    public static int maximum(int mtx[][]){
        int max=-99999;
        int MAXi=0;
        int MAXj=0;
        for(int i=0;i<mtx.length;i++){
            for(int j=0;j<mtx[0].length;j++){
                if(mtx[i][j]>=max){
                    max=mtx[i][j];
                    MAXi=i;
                    MAXj=j;
                }
            }
        }
        System.out.println("the maximum value is "+max+" at index( "+MAXi+","+MAXj+" )");
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
        maximum(matrix);
    }
}
