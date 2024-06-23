public class MoveZerosToEnd {
    public void moveZeroes(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static  void main(String args[]){
        MoveZerosToEnd mzte = new MoveZerosToEnd();

        int arr[] = {10,0,2,4,0,0,8,5,7,6,7,0,0,0,0,8,11,0,0};

        System.out.println("original Array : ");
        mzte.printArray(arr);


        System.out.println("Moving Zeros to end of Array : ");
        mzte.moveZeroes(arr);
        mzte.printArray(arr);
    }
}