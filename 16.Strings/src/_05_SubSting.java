public class _05_SubSting {
    public static String subsrtring(String str,int si, int ei){
        String substr = "";
        for(int i = si ;i<ei;i++){
            substr = substr+str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        //derived function
        System.out.println(subsrtring(str,0,5));

        //inbuilt function
        System.out.println(str.substring(0,6));

    }
}
