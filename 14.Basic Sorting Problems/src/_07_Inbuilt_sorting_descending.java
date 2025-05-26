import java.util.*;
public class _07_Inbuilt_sorting_descending {
    public static void main(String[] args) {
        Integer arry[] = {5,3,8,2,9};
        Arrays.sort(arry,0,5,Collections.reverseOrder());
        for(int i = 1 ;i<=arry.length ;i++){
            System.out.print(arry[i-1] + " ");
        }
    }
}
