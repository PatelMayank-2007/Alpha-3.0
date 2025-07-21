public class _08_first_occurence {
    public static int firOccu(int arry[],int key,int i){
        if(i==arry.length){
            return -1;
        }
        if(arry[i]==key){
            return i;
        }
       return firOccu(arry,key,i+1);
    }

    public static void main(String[] args) {
        int key =7;
        int arry[]={1,4,5,3,5,3,7,5,7};
        System.out.println(firOccu(arry,key,0));
    }
}
