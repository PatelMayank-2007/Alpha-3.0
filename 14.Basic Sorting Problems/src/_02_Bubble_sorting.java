import java.util.Scanner;

public class _02_Bubble_sorting {
    public static int Bubble(int num[]) {
        int n = num.length;

        for (int turns = 0; turns <= n - 2; turns++) {
            for (int j = 0; j<=n-2-turns;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted arry is :");
        for (int k = 0;k<=n;k++){
            System.out.print(num[k]+" ");
        }
        System.out.println();

        return 0;
    }

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter total number of element you want to sort:");
        int x = M.nextInt();
        System.out.println("Enter elements of array:");
        int[] arry = new int[x];
        for (int i = 0; i < x; i++) {
            arry[i] = M.nextInt();
        }

       Bubble(arry);
    }
}
