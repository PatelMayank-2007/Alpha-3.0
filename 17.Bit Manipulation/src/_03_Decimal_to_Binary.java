import java.util.Scanner;

public class _03_Decimal_to_Binary {
    public static int D_to_B(int deciNumber){
        int decnum = deciNumber;
        int rem = 0;
        int binary = 0;
        int pow=0;
        while(decnum>0){
            rem = decnum % 2;
            binary = binary + (rem*(int) Math.pow(10,pow));
            pow++;
            decnum = decnum/2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter the value of decimal number:");
        int x = M.nextInt();
        System.out.println("your decimal number " + x + " to binary is " + D_to_B(x));


    }
}
