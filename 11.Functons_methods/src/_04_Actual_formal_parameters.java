import java.util.Scanner;

public class _04_Actual_formal_parameters{
    public static void add(int num1,int num2)//here num1 and num2 are formal parameters
    {
        int sum = num1 + num2;
        System.out.println("sum is :" +sum);
    }

    public static void main(String[] args) {

        Scanner M = new Scanner(System.in);
        int a = M.nextInt();
        int b = M.nextInt();
        add(a,b);// here a and b is actual parameters.
    }
}

