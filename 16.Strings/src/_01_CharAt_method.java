public class _01_CharAt_method {
    public static int printStr(String str){
        for(int i=0;i<=str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        String firstname = "Janvi";
        String lastname = "Patel";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        printStr(fullname);

    }
}
