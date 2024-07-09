public class ArrayIsSortedRotated {
    public static boolean checkRotatedAndSorted(int arr[]){
        
        // Your code here
        int count = 0;
        int res = -1;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                count++;
                res = i;
            }
                
        }
        
        if(count == 0)
            return false;
        
        leftRotateDPlaces(arr, res+1);
        
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        
        return true;
        
    }
    
    public static void leftRotateDPlaces(int arr[], int d){
        int temp[] = new int[d];
        int n = arr.length;

        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i=d; i< arr.length;i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i< d;i++){
            arr[i+n-d] = temp[i];
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {3,4,5,1,2};


        System.out.println("Orginal Array : ");
        printArray(arr);
        System.out.println(checkRotatedAndSorted(arr));
    }
}
