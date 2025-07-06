public class _02_checking_palindrome {
    public static boolean palindrome(String str){
        for(int i =0;i<=str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mayank";
        String str2 = "noon";

        System.out.println(palindrome(str));
        System.out.println(palindrome(str2));

    }
}
