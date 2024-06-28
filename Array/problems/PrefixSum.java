public class PrefixSum {

    public int getPrefixSum(int arr[],int left, int right){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i=1; i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        if(left == 0)
            return prefix[right];

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        PrefixSum ps = new PrefixSum();
        int arr[] = { 1, 3, 5, 2, 4, 6, 8 };
        System.out.println("Prefix Sum of elements from index 1 to 3 is : " + ps.getPrefixSum(arr, 1, 3));

        int arr1[] = { 1, 4, 20, 3, 10, 5 };
        System.out.println("Prefix Sum of elements from index 2 to 4 is : " + ps.getPrefixSum(arr1, 2, 4));
    }
}
