public class _07_Is_sorted {
    public static boolean sort(int arry[],int i){
        if(i == arry.length-1){
            return true;
        }
        if(arry[i] > arry[i+1]){
            return false;
        }
        return sort(arry,i+1);
    }

    public static void main(String[] args) {
        int arry[] = {1,2,3,4,6,5,8,9};
        System.out.println(sort(arry,0));
    }
}
