import java.util.Scanner;

public class _03_syntx_with_parasmeters {
    public static void add(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("sum is :" +sum);
    }

    public static void main(String[] args) {

        Scanner M = new Scanner(System.in);
        int a = M.nextInt();
        int b = M.nextInt();
        add(a,b);
    }
}
