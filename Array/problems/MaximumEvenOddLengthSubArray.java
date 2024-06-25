public class MaximumEvenOddLengthSubArray{

    public int  maximumEvenOddLengthSubArray(int arr[]){

        int n = arr.length;
        int count = 1;
        int result = 1;

        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                count++;
                result = Math.max(result,count);
            }else{
                count = 1;
            }
        }

        return result;

    }

    public void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        MaximumEvenOddLengthSubArray meolsa = new MaximumEvenOddLengthSubArray();

        int arr[] = {10,12,14,7,8};
        int arr1[] = {7,10,13,14};

        System.out.println("Original Array : ");
        meolsa.printArray(arr);
        System.out.println("Maximum Even Odd Length SubArray : "+meolsa.maximumEvenOddLengthSubArray(arr));

        System.out.println("Original Array : ");
        meolsa.printArray(arr1);
        System.out.println("Maximum Even Odd Length SubArray : "+meolsa.maximumEvenOddLengthSubArray(arr1));
    }

}