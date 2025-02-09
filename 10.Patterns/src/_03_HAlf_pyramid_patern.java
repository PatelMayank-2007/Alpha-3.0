import java.util.Scanner;

public class _03_HAlf_pyramid_patern {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        int n;
        n = M.nextInt();
        for (int i = 1; i<=n;i++){
            for (int j = 1;j<= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
