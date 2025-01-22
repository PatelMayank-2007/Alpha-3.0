import java.util.Scanner;

public class _05_Income_tax_calculator {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter your income:");
        float a = M.nextFloat();
        if (a<500000){
            System.out.println("You income is less than 500000 so there is no tax for you.");
        }
        else if ((a>500000)&&(a<1000000)){
            float b = (a/100)*20;
            System.out.println(b +" is amount of tax over " + a);
        }
        else if (a>1000000){
            float c = (a/100)*30;
            System.out.println(c +" is amount of tax over " + a);
        }
    }
}
