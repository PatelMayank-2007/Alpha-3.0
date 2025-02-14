import java.util.Scanner;

public class _09_Binomial_cofficient_by_function {
    public static double facto(double a){
        int b =1;
        for (int i= 1;i <= a;i++){
            b=b *i;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner M = new Scanner (System.in) ;
        System.out.println("Enter th evalue of n:");
        int n =M.nextInt();
        System.out.println("Enter th evalue of r:");
        int r =M.nextInt();
        double bino = facto(n)/(facto(r)*facto(n-r));
        System.out.println("Binomial cofficent of above number is " + bino);
    }
}
