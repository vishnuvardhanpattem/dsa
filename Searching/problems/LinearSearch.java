package Searching.problems;

public class LinearSearch {
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int num = 4;
        System.out.println("Element found at index: " + linearSearch(arr, num));
    }

    public static int linearSearch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
