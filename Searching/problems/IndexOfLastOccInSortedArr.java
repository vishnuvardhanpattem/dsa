package Searching.problems;

public class IndexOfLastOccInSortedArr {
    public int lastOcc(int arr[], int n, int num) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || arr[mid] != arr[mid + 1] ) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 10, 10, 20, 20, 40 };
        int num = 40;
        IndexOfLastOccInSortedArr bs = new IndexOfLastOccInSortedArr();
        System.out.println("Element found at index: " + bs.lastOcc(arr, arr.length, num));
    }

}
