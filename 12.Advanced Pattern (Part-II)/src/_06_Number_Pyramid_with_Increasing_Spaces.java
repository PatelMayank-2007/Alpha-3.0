public class _06_Number_Pyramid_with_Increasing_Spaces {
    public static void main(String[] args) {
        int n = 4;//n=rows
        int cols=(2*n)-1;
        /*(inner loops)
            this problem is divided in three parts:
             1.print left numbers (starts from 1 to n-i)
             2.print middle spaces (starts from 1 to (2i-1))
             3.print right numbers (starts from n+i to cols)
         */

        for(int i = 0;i<= n;i++){
            int num = 1;
            //inner loop

            //1.left numbers
            for(int j=1;j<=n-i;j++){
                System.out.print(num);
                num++;
            }
            //middle spaces
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" ");
            }
//            right numbers starting from remaining numbers from left side and print upto cols
            for(int j=cols-(n-i)+1;j<=cols;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
