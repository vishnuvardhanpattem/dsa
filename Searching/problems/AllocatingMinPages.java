package Searching.problems;

public class AllocatingMinPages {

    public boolean isFeasible(int arr[], int n, int k, int ans){
        int req = 1, sum = 0;
        for(int i=0; i<n; i++){
            if(sum + arr[i] > ans){
                req++;
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
        }
        return req <= k;
    }
    
    public int minPages(int arr[], int n, int k){
        if(n<k)
            return -1;
        int sum = 0, mx = 0;
        for(int i=0; i<n;i++){
            sum += arr[i];
            mx = Math.max(mx, arr[i]);
        }
        int low = mx, high = sum , res = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isFeasible(arr,n,k,mid)){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AllocatingMinPages amp = new AllocatingMinPages();
        int arr[] = {10, 20, 10, 30};
        int n = arr.length;
        int k = 2;
        System.out.println("Minimum number of pages are : " + amp.minPages(arr, n, k));
    }
}
