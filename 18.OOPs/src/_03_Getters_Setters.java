public class _03_Getters_Setters {

    public static void main(String args[]) {

        Pen p1 = new Pen(); // created p1 as a new object

        System.out.println("Before modifying the values of the private variables");
        System.out.println(p1.getColor()); // prints "blue"
        System.out.println(p1.getTip());   // prints 5

        System.out.println("After modifying the value of the private variables");
        p1.setColor("black");
        p1.setTip(10);

        System.out.println(p1.getColor()); // prints "black"
        System.out.println(p1.getTip());   // prints 10
    }

    static class Pen {
        private String color = "blue";
        private int tip = 5;

        // Getters used to get value of the variables
        public String getColor() {
            return this.color;
        }

        public int getTip() {
            return this.tip;
        }

        // Setters used to modify the value
        public void setColor(String newColor) {
            this.color = newColor;
        }

        public void setTip(int newTip) {
            this.tip = newTip;
        }
    }
}


