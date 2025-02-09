public class _11_breaks {
    public static void main(String[] args) {
        int i;
        for(i=1;i<12;i++){
            System.out.println(i);
            if(i==7){
                break;
            }
        }
        System.out.println("I am outside loop");
    }
}
