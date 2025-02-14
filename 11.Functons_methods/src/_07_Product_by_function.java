import java.util.Scanner;

public class _07_Product_by_function {
    public static int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner M = new Scanner (System.in) ;
        System.out.println("Enter th evalue of a:");
        int x =M.nextInt();
        System.out.println("Enter th evalue of b:");
        int y =M.nextInt();
        int c= multiply(x,y);
        System.out.println("product of a and b is :"+c);
    }
}
