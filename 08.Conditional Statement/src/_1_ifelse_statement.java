public class _1_ifelse_statement {
    public static void main(String[] args) {
        int age = 22;
        if (age > 18) {
            System.out.println("you can drive.");
        }
        else if (age>13 && age <18){
            System.out.println("you are teenager");
        }
        else {
            System.out.println("you can not drive.");
        }
    }
}
