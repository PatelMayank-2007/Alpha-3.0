public class _09_last_occurence {
   public static int  lastOccu(int arry[],int key,int i){
      if(i==arry.length){
         return -1;
      }
      int isFound= lastOccu(arry,key,i+1);
      if(isFound!=-1){
         return isFound;
      }
      if (arry[i] == key) {
         return i; // if current index is key, return it
      }
         return -1;
   }

   public static void main(String[] args) {
      int key =5;
      int arry[]={1,4,5,3,5,3,7,5,7};
      System.out.println(lastOccu(arry,key,0));

   }
}
