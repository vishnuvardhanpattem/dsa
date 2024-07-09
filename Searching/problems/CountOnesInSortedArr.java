package Searching.problems;

public class CountOnesInSortedArr {
    public int countOnes(int arr[],int n){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == 0)
                low = mid + 1;
            else{
                if(mid == 0 || arr[mid-1] == 0)
                    return n-mid;
                else
                    high = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        CountOnesInSortedArr co = new CountOnesInSortedArr();

        int arr[] = {0, 0, 0, 1, 1, 1, 1};
        System.out.println("Number of 1's in the array are : " + co.countOnes(arr, arr.length));
    }
}
