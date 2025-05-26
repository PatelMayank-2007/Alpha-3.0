import java.util.Scanner;

public class _06_Insertion_sorting {
    public void InsertionSort(int[] A) {
        int i, j, v;

        for (i = 1; i <= A.length - 1; i++) {
            v = A[i];
            j = i;

            while (A[j-1] > v && j >= 1) {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = v;
        }
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
        _06_Insertion_sorting sorter = new _06_Insertion_sorting();
        sorter.InsertionSort(arry);

        System.out.println("Sorted array:");
        for (int i = 0; i < x; i++) {
            System.out.print(arry[i] + " ");
        }
        System.out.println();
    }
}
