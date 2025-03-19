public class _03_Inverted_rotated_Half_Pyramid {
    public static int Inverted_rotated_Half_Pyramid() {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        Inverted_rotated_Half_Pyramid();
    }
}
