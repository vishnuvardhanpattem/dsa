
public class MaximumDifference {

    public int maxDiff(int arr[]) { // arr[j] - arr[i] && j>i

        int max = -1000000;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > max) {
                max = arr[i] - min;
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return max;
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};

        int arr1[] = {10, 20, 30};

        int arr2[] = {30,10,8,2};

        MaximumDifference maximumDifference = new MaximumDifference();

        System.out.println("Original Array : ");
        maximumDifference.printArray(arr);

        System.out.println("Maximum Difference of Array with arr[j] - arr[i] && j>i : ");
        int res = maximumDifference.maxDiff(arr);
        System.out.println("Max Diff : " + res);

        System.out.println("Original Array : ");
        maximumDifference.printArray(arr1);

        System.out.println("Maximum Difference of Array with arr[j] - arr[i] && j>i : ");
        int res1 = maximumDifference.maxDiff(arr1);
        System.out.println("Max Diff : " + res1);

        System.out.println("Original Array : ");
        maximumDifference.printArray(arr2);

        System.out.println("Maximum Difference of Array with arr[j] - arr[i] && j>i : ");
        int res2 = maximumDifference.maxDiff(arr2);
        System.out.println("Max Diff : " + res2);
    }
}