import java.util.Scanner;

public class _15_Primes_in_range {
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
    public static void primesInRange(int n){
        for (int i = 2; i<=n;i++){
           if( IsPrime(i)){
                System.out.print(i +",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter th evalue of a:");
        int x = M.nextInt();
        primesInRange(x);
    }
}
