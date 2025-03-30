public class _11_Print_sub_arrays {
    public static int subarrays(int arry[]) {
        int n = arry.length;
        int tot_subarray = 0;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arry[k] + " ");
                }
                tot_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("total sub arrays = "+tot_subarray);
        return 0;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);
    }
}
