import java.math.BigInteger;

public class extra1 {

    public static BigInteger combination(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ZERO;
        k = Math.min(k, n - k);
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            result = result.multiply(BigInteger.valueOf(n - k + i))
                    .divide(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 23, k = 12;
        System.out.println("C(" + n + ", " + k + ") = " + combination(n, k));
    }
}