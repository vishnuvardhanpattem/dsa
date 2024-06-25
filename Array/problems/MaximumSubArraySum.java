public class MaximumSubArraySum {
    public void maximumSubArraySum(int[] arr) {
        int n = arr.length;

        // Kadane's Algorithm
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum SubArray Sum : " + maxSum);
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MaximumSubArraySum msas = new MaximumSubArraySum();

        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Original Array : ");
        msas.printArray(arr);
        msas.maximumSubArraySum(arr);

        System.out.println("Original Array : ");
        msas.printArray(arr1);
        msas.maximumSubArraySum(arr1);
    }
}
