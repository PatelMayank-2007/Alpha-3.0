import java.util.Scanner;

public class _3_odd_or_even {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = M.nextInt();
        if (a % 2 == 0) {
            System.out.println("given number is even number.");
        } else {
            System.out.println("given number is odd number.");
        }
    }
}
