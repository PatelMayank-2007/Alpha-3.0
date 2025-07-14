public class _05_Operations {
    public static int getI(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setI(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearI(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateI(int n, int i, int newBit) {
        if(newBit==0){
            return clearI(n,i);
        }
        else{
            return setI(n,i);
        }
    }
    public static int clearLastIBits(int n,int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    public static int clearBitsInRange(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitmask = a|b;
        return n&bitmask;

    }

    public static void main(String[] args) {
        System.out.println(getI(5, 0));
        System.out.println(setI(10, 2));
        System.out.println(clearI(10, 1));
        System.out.println(updateI(10,2,1));
        System.out.println(clearLastIBits(15,2));
        System.out.println(clearBitsInRange(15,2,4));
    }
}
