public class LeftRotate {

    public void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void leftRotateOnePlace(int arr[]){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public void leftRotateDPlaces(int arr[], int d){
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

    public void leftRotateDPlacesBest(int arr[], int n, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public void reverse(int arr[], int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};

        LeftRotate leftRotate = new LeftRotate();
        System.out.println("Orginal Array : ");
        leftRotate.printArray(arr);

        System.out.println("Rotate one place of an Array : ");
        leftRotate.leftRotateOnePlace(arr);
        leftRotate.printArray(arr);


        System.out.println("Orginal Array : ");
        leftRotate.printArray(arr);


        System.out.println("Rotate d place of an Array : ");
        leftRotate.leftRotateDPlaces(arr,3);
        leftRotate.printArray(arr);

        System.out.println("Orginal Array : ");
        leftRotate.printArray(arr);


        System.out.println("Rotate d place of an Array : ");
        leftRotate.leftRotateDPlacesBest(arr,arr.length,3);
        leftRotate.printArray(arr);

    }
}