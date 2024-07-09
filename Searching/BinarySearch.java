package Searching;

public class BinarySearch {
    public int binarySearch(int arr[], int num, int low ,int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int num = 4;
        BinarySearch bs = new BinarySearch();
        System.out.println("Element found at index: " + bs.binarySearch(arr, num, 0, arr.length-1));
    }
}
