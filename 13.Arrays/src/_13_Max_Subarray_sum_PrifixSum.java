public class _13_Max_Subarray_sum_PrifixSum {
    public static void Max_subarrays_sum(int arry[]) {
        int curr_sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix_sum[] = new int[arry.length];
        prefix_sum[0] = arry[0];
        for (int i = 1; i < arry.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arry[i];

        }
        for (int i = 0; i < arry.length; i++) {
            int start = i;
            for (int j = i; j < arry.length; j++) {
                int end = j;
                if (start == 0) {
                    curr_sum = prefix_sum[end];
                } else {
                    curr_sum = prefix_sum[end] - prefix_sum[start - 1];
                }
                if (maxsum<curr_sum){
                    maxsum=curr_sum;
                }
            }
        }
        System.out.println("Max subarray sum from the following sub array is "+maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {4, 7, -3, 23, 54, 75, -78, 56};
        Max_subarrays_sum(numbers);
    }
}
