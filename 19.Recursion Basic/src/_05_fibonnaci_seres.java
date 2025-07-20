public class _05_fibonnaci_seres {
    public static int fibo(int n){
        if(n == 0|| n == 1){
            return n ;
        }
        int a = fibo(n-1) + fibo(n-2);
        return a;
    }

    public static void main(String[] args) {
        int n = 50;

        int a =fibo(n);
        System.out.println(a);
    }
}
