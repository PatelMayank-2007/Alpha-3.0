import java.util.Scanner;

public class _19_decimal_to_binary {
    public static int deci_to_bin(int a) {
        int rem = 0;
        int decimal = a;
        int binary = 0;
        int pow = 0;
        //logic = decimal number dividing with 2 and the remender we got should be written in down to up manner.
        // first taking remender from the user number and multiplying with 10 pow
        while (a > 0) {
            rem = a % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            a = a/2;// Update the value of `a` by dividing it by 2.
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter the value of decimal number:");
        int x = M.nextInt();
        int bin = deci_to_bin(x);
        System.out.println("your decimal number " + x + " to binary is " + bin);
    }
}
