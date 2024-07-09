package Searching.problems;

public class TripletSumSortedArr {

    public boolean isPair(int arr[], int n, int x, int si){
        int i = si, j = n-1;
        while (i<j){
            if(arr[i] + arr[j] == x)
                return true;
            else if(arr[i] + arr[j] > x)
                j--;
            else
                i++;
        }
        return false;
    }

    public boolean isTriplet(int arr[], int n, int x){
        for(int i=0;i<n;i++){
            if(isPair(arr,n,x-arr[i],i+1))
                    return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 8, 9, 20, 40 };
        int num = 32;
        TripletSumSortedArr bs = new TripletSumSortedArr();
        System.out.println("Is Triplet found ? : " + bs.isTriplet(arr, arr.length, num));
    }
}
