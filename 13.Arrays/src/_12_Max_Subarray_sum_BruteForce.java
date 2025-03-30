public class _12_Max_Subarray_sum_BruteForce {
    //first finding all subarray of the array
    public static int Max_subarrays_sum(int arry[]) {
//
        int tot_subarray = 0;
        int MaxSum = 0;
        for (int i = 0; i < arry.length; i++) {
            int start = i;
            for (int j = i; j < arry.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arry[k] + " ");
                    sum = sum + arry[k];
                }
                if (sum > MaxSum) {
                    MaxSum = sum;
                }
                tot_subarray++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays = " + tot_subarray);
        System.out.println("Max subarray sum from the following sub array is "+MaxSum);

        return 0;
    }

    public static void main(String[] args) {
        int numbers[] = {4, 7, -3, 23, 54, 75, -78, 56};
        Max_subarrays_sum(numbers);
    }
}
