public class _08_Reverse_a_number {
    public static void main(String[] args) {
        int a = 232007;
        int rem;
        while (a != 0) {
            rem = a % 10;
            System.out.print(rem);
            a= a/10;
        }
        System.out.println();
    }
}
