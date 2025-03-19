public class _04_Inverted_Half_Pyramid_Pattern_with_Numbers {
    public static int Inverted_Half_Pyramid_Pattern_with_Numbers(){
        int n = 5;

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return 0;

    }

    public static void main(String[] args) {
        Inverted_Half_Pyramid_Pattern_with_Numbers();
    }
}
