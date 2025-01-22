import java.util.Scanner;

public class _04_Print_1_to_n {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.print("enter a number to print:");
        int a= M.nextInt();
        int i = 1;
        while(i<=a){
            System.out.println(i);
            i++;
        }

    }
}
