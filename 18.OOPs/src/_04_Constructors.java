public class _04_Constructors {
            public static void main(String args[]){
                //non paramatrized constructors
            Student s1 = new Student();
            //paramaterized constructor
            Peen p1 = new Peen("blue",5);
            System.out.println(p1.color);
                System.out.println("hello");
        }
    }
 class Student{
     String name;
     int roll;
     // creating constructor intentionaly
     Student(){
         System.out.println("You have witten this inside the Constructor");
     }
 }
    class Peen{
        String color;
        int tip;
        //Giving initial values using a contructor
        Peen(String newColor, int newTip){
            this.color = newColor;
            this.tip = newTip;
        }
    }
