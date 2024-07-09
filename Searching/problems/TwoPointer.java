package Searching.problems;

public class TwoPointer {
    
    boolean isPair(int arr[], int n, int x) {
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 7, 8, 11 };
        int x = 14;
        TwoPointer tp = new TwoPointer();
        System.out.println("Pair found: " + tp.isPair(arr, arr.length, x));
    }
}
