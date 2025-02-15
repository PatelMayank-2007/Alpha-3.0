import java.util.Scanner;

public class _14_prime_by_function {
    public static boolean IsPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter th evalue of a:");
        int x = M.nextInt();
        boolean m = IsPrime(x);
        System.out.println(m);
    }
}
