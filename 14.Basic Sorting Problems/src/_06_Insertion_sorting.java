import java.util.Scanner;

public class _06_Insertion_sorting {
    public void InsertionSort(int[] arry) {
        for (int i = 1 ; i<arry.length;i++){
            int current_element = arry[i];
            int previous_element = i-1;
            //finding out the correct position to insert
            while(previous_element >= 0&& arry[previous_element] > current_element){
                arry[previous_element+1] = arry[previous_element];
                previous_element--;
            }
            //insetion
            arry[previous_element +1] = current_element;
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
