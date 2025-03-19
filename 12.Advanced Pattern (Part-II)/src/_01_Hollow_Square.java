import java.util.Scanner;

public class _01_Hollow_Square {
    public static void H_SQuare(){
//logic:for hollow square in boundary rows should be in 1 or 4 line and cols should be in 1 or 5 line.....
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        H_SQuare();
    }
}
