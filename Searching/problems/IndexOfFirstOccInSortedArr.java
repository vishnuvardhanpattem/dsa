package Searching.problems;

public class IndexOfFirstOccInSortedArr {

    public int firstOcc(int arr[], int n, int num) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != num)
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 10, 10, 20, 20, 40 };
        int num = 10;
        IndexOfFirstOccInSortedArr bs = new IndexOfFirstOccInSortedArr();
        System.out.println("Element found at index: " + bs.firstOcc(arr, arr.length, num));
    }

}
