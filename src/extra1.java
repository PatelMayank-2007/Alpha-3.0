public class extra1 {
    public static void main(String[] args) {
//        int n = 10899;
//        int rev = 0;
//        while (n > 0) {
//            int lastDigit = n % 10;
//            rev = (rev * 10) + lastDigit;
//            n = n / 10;
//
//        }
//        System.out.println(rev);
        int arry[]={2,43,65,23,54,1};
        int n = arry.length;

        int smallest =Integer.MAX_VALUE;
        for(int i =0;i<=n-1;i++){
            if(arry[i]<smallest){
                smallest=arry[i];
            }
        }
        System.out.println(smallest);
    }
}


