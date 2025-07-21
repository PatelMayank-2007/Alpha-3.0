public class _10_power_calculation {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        return x * (power(x, n-1));
    }

    public static void main(String[] args) {
        int base = 2;
        int powr=10;
        System.out.println(power(base,powr));
    }
}
