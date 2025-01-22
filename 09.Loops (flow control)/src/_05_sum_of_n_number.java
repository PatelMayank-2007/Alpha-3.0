import java.util.Scanner;

public class _05_sum_of_n_number {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = M.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=a){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
