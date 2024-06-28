public class SubArrayWithGivenSum {

    public boolean subArrayWithGivenSum(int arr[], int sum) {
        int n = arr.length;
        int currSum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            while (currSum > sum) {
                currSum -= arr[count++];
            }
            if (currSum == sum) {
                return true;
            }
        } 
        return false;
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        SubArrayWithGivenSum sags = new SubArrayWithGivenSum();

        int arr[] = { 1, 3, 5, 2, 4, 6, 8 };
        int sum = 9;

        int arr1[] = { 1, 4, 20, 3, 10, 5 };
        int sum1 = 33;

        System.out.println("Original Array : ");
        sags.printArray(arr);
        System.out.println("SubArray with sum " + sum + " is present : " + sags.subArrayWithGivenSum(arr, sum));

        System.out.println("Original Array : ");
        sags.printArray(arr1);
        System.out.println("SubArray with sum " + sum1 + " is present : " + sags.subArrayWithGivenSum(arr1, sum1));
    }

}