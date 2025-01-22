import java.util.Scanner;

public class _11_Practice_question {
    public static void main(String[] args) {

        //question 1 :Write a Java program to get a number from the user and print whether it is positive or negative.


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        if (number > 0) {
//            System.out.println("The number is positive.");
//        } else if (number < 0) {
//            System.out.println("The number is negative.");
//        } else {
//            System.out.println("The number is zero.");
//        }

        // question 2:Finish the code to print "You have a fever" if the temperature is above 100, otherwise print "You don't have a fever".
//        double temp = 103.5;
//
//        if (temp > 100) {
//            System.out.println("You have a fever.");
//        } else {
//            System.out.println("You don't have a fever.");
//        }

        //Question 3 :Write a Java program to input a week number (1-7) and print the day of the week name using a switch case.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter week number (1-7): ");
//        int weekNumber = scanner.nextInt();
//
//        switch (weekNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid week number.");
//        }

        // question 4:Determine the value of x and y in the given program.
//        int a = 63, b = 36;
//
//        boolean x = (a < b) ? true : false; // x will be false
//        int y = (a > b) ? a : b; // y will be 63 (value of a)
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        // question 5 : Write a Java program that takes a year from the user and prints whether that year is a leap year or not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
