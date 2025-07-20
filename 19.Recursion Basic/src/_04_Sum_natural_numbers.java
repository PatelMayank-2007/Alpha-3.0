public class _04_Sum_natural_numbers {
    public static int sum_nat(int n){

        if(n ==0){
            return 0;
        }
        int a = n + sum_nat(n-1);
        return a;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum_nat(n));
    }
}
