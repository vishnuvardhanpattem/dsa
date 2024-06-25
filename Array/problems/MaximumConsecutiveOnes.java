public class MaximumConsecutiveOnes {
    public void maximumConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
        }

        // Alternate Solution
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == 1) {
        //         count++;
        //     } else {  
        //         result = Math.max(result, count);
        //         count=0;
        //     }
        // }

        // if(arr[n-1]==1 && arr[n-2]==1){
        //     result = count++;
        // }

        System.out.println("Maximum Consecutive Ones : " + result);
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MaximumConsecutiveOnes mco = new MaximumConsecutiveOnes();

        int arr[] = { 0, 1, 1, 0, 1, 1, 1 };

        int arr1[] = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};

        System.out.println("Original Array : ");
        mco.printArray(arr);
        mco.maximumConsecutiveOnes(arr);

        System.out.println("Original Array : ");
        mco.printArray(arr1);
        mco.maximumConsecutiveOnes(arr1);
    }
}