public class _03_Factorial {
    public static int fact(int n){
        int a;

        if(n == 0){
            return 1;
        }
        a = n  * fact(n-1);
        return a;
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(fact(n));
    }
}
