import java.util.Scanner;

public class _12_Break_Question {
    public static void main(String[] args) {
        //keep entering number from user until user enters multiple of 10
       Scanner M = new Scanner(System.in);
       do{
           System.out.println("Enter your number:");
           int n = M.nextInt();
           if (n%10==0){
               System.out.println("Number given is multiple of 10.");
               break;
           }
       }while(true);
    }
}
