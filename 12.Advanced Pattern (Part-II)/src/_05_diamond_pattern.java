public class _05_diamond_pattern {
    public static void main(String[] args) {
        int n = 5;

//   //long method
//   /first half
//
//        for (int i = 0; i <= n; i++) {
//            for (int j = i; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//  //second half just by reversing outer loop
//        for (int i = n; i >=0; i--) {
//            for (int j = i; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //shortcut method by apna college
        for(int i=0;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //mirror half pyramid just by reversing outer loop
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
