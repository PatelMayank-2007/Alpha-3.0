import java.util.Scanner;


public class _04_selection_sorting {
    public static int select_sort(int num[]) {
        int n = num.length;

        for (int i = 0; i < n; i++) {
            int smallest = i;
            //here we assume that our current element is smallest element.
            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (num[smallest] > num[j]) {
                    //here if our smallest element value is greater than current element than we will say our current value is smallest
                    smallest= j;
                }
            }
            // Swap the smallest element with the first element of the unsorted part
            int temp = num[smallest];
            num[smallest]=num[i];
            num[i]=temp;
        }
        System.out.println("sorted arry is :");
        for (int k = 0;k<n;k++){
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
        select_sort(arry) ;

    }
}
