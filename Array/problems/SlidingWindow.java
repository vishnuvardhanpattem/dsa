public class SlidingWindow {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printMaxSum(int arr[], int k){
        int n =arr.length;
        int maxSum = 0;
        for(int i=0; i<k;i++){
            maxSum += arr[i];
        }

        int windowSum = maxSum;

        for(int i=k; i<n; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum sum of "+k+" elements is : " + maxSum);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4, 6, 8 };
        int[] arr2 = {5, 2, -1, 0, 3};

        System.out.println("Array: ");
        printMaxSum(arr, 3);

        System.out.println("Array2: ");
        printMaxSum(arr2, 3);
    }
}
