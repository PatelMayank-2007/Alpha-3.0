import java.util.Scanner;

public class _08_Factorial_by_function {
    public static double facto(double a){
        int b =1;
        for (int i= 1;i <= a;i++){
            b=b *i;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner M = new Scanner (System.in) ;
        System.out.println("Enter th evalue of a:");
        double x =M.nextInt();

        double f = facto(x);

        System.out.println("FActorial of a given number is :" + f );
    }
}
