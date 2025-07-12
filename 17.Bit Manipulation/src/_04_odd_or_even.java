import java.util.Scanner;

public class _04_odd_or_even {
    public static void oORe(int a) {
        int bitmask = 1;
        if ((a & bitmask) == 0) {
            System.out.println("entered decimal number is even number");
        } else {
            System.out.println("entered decimal number is odd number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner M = new Scanner(System.in);
        int x = M.nextInt();
        oORe(x);
    }
}