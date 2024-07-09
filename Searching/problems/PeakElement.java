package Searching.problems;

public class PeakElement {
    public int peakElement(int arr[],int n){
        if(n == 1)
            return arr[0];
        if(arr[0] >= arr[1])
            return arr[0];
        if(arr[n-1] >= arr[n-2])
            return arr[n-1];

        int low = 1, high = n-2;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1])
                return arr[mid];
            else if (mid > 0 &&arr[mid-1] >= arr[mid])
                high = mid-1;
            else 
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        PeakElement pe = new PeakElement();

        int arr[] = {5,20,40,30,70,50};
        System.out.println("Peak Element should be : " + pe.peakElement(arr, arr.length));
    }
}
