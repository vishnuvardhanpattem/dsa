public class Array {

    public static void main(String args[]) {
        int arr[] = new int[10];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;

        System.out.println("Before Insertion:");
        printArray(arr);
        insert(arr, 3, 10);
        System.out.println("After Insertion:");
        printArray(arr);

        System.out.println("Before Deletion:");
        printArray(arr);
        delete(arr, 3);
        System.out.println("After Deletion:");
        printArray(arr);
    }

    public static void insert(int arr[], int index, int num) {
        if (index >= arr.length) {
            System.out.println("Index is out of bounds.");
            return;
        }

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = num;
    }

    public static void delete(int arr[], int index) {
        if (index >= arr.length) {
            System.out.println("Index is out of bounds.");
            return;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
