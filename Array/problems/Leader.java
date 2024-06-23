public class Leader {

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void leader(int arr[]) {
        int n = arr.length;

        if (n == 1) {
            System.out.print(arr[0]);
        }

        int currLdr = arr[n - 1];
        System.out.print(currLdr + " ");

        for (int i = n - 2; i >= 0; i--) {

            if (currLdr < arr[i]) {
                currLdr = arr[i];
                System.out.print(currLdr + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 5, 6, 8, 11, 10, 8, 4, 7};

        Leader ld = new Leader();

        System.out.println("Original Array : ");
        ld.printArray(arr);

        System.out.println("Leaders in array : ");
        ld.leader(arr);
    }

}