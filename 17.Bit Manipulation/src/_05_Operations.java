public class _05_Operations {
    public static int getI(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setI(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearI(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(getI(5,0));
        System.out.println(setI(10,2));
        System.out.println(clearI(10,1));
    }
}
