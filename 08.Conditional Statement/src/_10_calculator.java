import java.util.Scanner;

public class _10_calculator {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.print("Enter  two number :");
        int a = M.nextInt();
        int b = M.nextInt();
        System.out.print("Enter a operator:");
        char operator = M.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("the chosen character is invalid");
                break;
        }
    }
}
