public class _08_String_Compression {
    public static String Compression(String str){
        String newStr="";
        for (int i = 0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            newStr = newStr + str.charAt(i);
            if(count > 1){
                newStr=newStr+count.toString();
            }

        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaaabccccccddd";
        System.out.println(Compression(str));
    }
}
