import java.util.*;


public class _07_Inbuilt_sorting {
    public static void main(String[] args) {
        int arry[] = {34,65,12,89,23};
        //Arrays.sort(arry);   This is for whole array sorting
        Arrays.sort(arry,0,3); //this is for sorting of array in yhe range we want but last element in non-inclusive so for 2 index have to pass 3.
        for(int i = 1 ;i<=arry.length ;i++){
            System.out.print(arry[i-1] + " ");
        }
    }
}
