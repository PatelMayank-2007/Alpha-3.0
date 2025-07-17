public class _05_Copy_constructors {
        public static void main(String args[]){

            S s1 = new S();

            s1.name = "abcd";
            s1.roll = 456;
            s1.pwd = 0000;
            s1.marks[0] = 10;
            s1.marks[1] = 9;




            S s2 = new S(s1);

            s2.pwd = 9999;
            System.out.println("Shallow copy");
            System.out.println("before chandging the values in the s1 object ");
            System.out.println("Marks of s2 are"+s2.marks[0]+","+s2.marks[1]);

            // changing the marks in s1

            s1.marks[0] = 6;
            s1.marks[1] = 5;

            System.out.println("After changing the values in s1");
            System.out.println("Marks of s2 are"+s2.marks[0]+","+s2.marks[1]);

            //marks will change as the it is done with SHALLOW COPY
            // but will not change if deep copy consturctor is used
        }

    }

    class S {

        String name;
        int roll;
        int pwd;
        int marks[];

        //Creating a function for the copy constructor

        //function for shallow copy

        // S(S s1){
        //     marks = new int[2];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;
        // }

        // function for deep fry

        S(S s1) {
            marks = new int[2];
            this.name = s1.name;
            this.roll = s1.roll;

            // copied the array deeply
            this.marks[0] = s1.marks[0];
            this.marks[1] = s1.marks[1];
        }


        // this for a empty object
        S() {
            marks = new int[2];

        }
    }

