public class _06_Largest_in_arrays {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    };
    public static void main(String[] args) {
        int marks[]= {1,34,5,34,6,87,8};
        System.out.println("largest value from the array is " + getlargest(marks));
    }
}
