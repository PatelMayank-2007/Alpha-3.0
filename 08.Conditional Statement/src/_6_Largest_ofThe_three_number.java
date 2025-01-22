public class _6_Largest_ofThe_three_number {
    public static void main(String[] args) {
        int a = 23;
        int b = 45;
        int c = 34;
        if (a > b) {
            if (a > c) {
                System.out.println("A is largest among three number.");
            } else {
                System.out.println("C is largest among three number.");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest among three number.");
            } else {
                System.out.println("C is largest among three number.");
            }
        }
    }
}

