import java.util.Scanner;

public class _8_Pass_OR_Fail {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int a = M.nextInt();
        String result = (a>33) ? "pass":"fail";
        System.out.println("student is " + result);

    }
}
