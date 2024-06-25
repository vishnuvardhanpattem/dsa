public class MaximumCircularArray {

    // Alternate Solution
    // public int maximumCircularArray(int arr[]) {
    //     int n = arr.length;
    //     int maxSum = arr[0];
    //     int currentSum = arr[0];
    //     int maxNormal = arr[0];
    //     int minNormal = arr[0];
    //     int minSum = arr[0];

    //     for (int i = 1; i < n; i++) {
    //         currentSum = Math.max(arr[i], currentSum + arr[i]);
    //         maxSum = Math.max(maxSum, currentSum);
    //     }

    //     for (int i = 1; i < n; i++) {
    //         currentSum = Math.min(arr[i], currentSum + arr[i]);
    //         minSum = Math.min(minSum, currentSum);
    //     }

    //     int totalSum = 0;
    //     for (int i = 0; i < n; i++) {
    //         totalSum += arr[i];
    //         maxNormal = Math.max(maxNormal, arr[i]);
    //         minNormal = Math.min(minNormal, arr[i]);
    //     }

    //     if (minSum == totalSum) {
    //         return maxNormal;
    //     }

    //     return Math.max(maxSum, totalSum - minSum);
    // }

    // public void printArray(int arr[]) {
    //     for (int i : arr) {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }


    public int maximumSubArraySum(int arr[]){
        int n = arr.length;
        int max_sum = arr[0];
        int curr_sum = arr[0];

        for(int i=1; i<n;i++){

            curr_sum = Math.max(arr[i], curr_sum+arr[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
        
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int maximumCircularArray(int arr[]){
        int n = arr.length;

        int max_kadane = maximumSubArraySum(arr);
        if(max_kadane < 0){
            return max_kadane;
        }

        int arr_sum = 0;
        for(int i=0;i<n;i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }

        int max_wrap = arr_sum + maximumSubArraySum(arr);

        return Math.max(max_kadane, max_wrap);

    }

    public static void main(String[] args) {
        MaximumCircularArray mca = new MaximumCircularArray();

        int arr[] = { 8, -8, 9, -9, 10, -11, 12 };
        int arr1[] = { 10, -3, -4, 7, 6, 5, -4, -1 };

        System.out.println("Original Array : ");
        mca.printArray(arr);
        System.out.println("Maximum Circular Array : " + mca.maximumCircularArray(arr));

        System.out.println("Original Array : ");
        mca.printArray(arr1);
        System.out.println("Maximum Circular Array : " + mca.maximumCircularArray(arr1));
    }
}
