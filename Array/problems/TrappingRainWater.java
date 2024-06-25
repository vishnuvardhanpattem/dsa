public class TrappingRainWater {
    public void trappingRainWater(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println("Trapped Rain Water : " + water);
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        TrappingRainWater trw = new TrappingRainWater();

        int arr[] = { 3, 0, 0, 2, 0, 4 };

        int arr1[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println("Original Array : ");
        trw.printArray(arr);
        trw.trappingRainWater(arr);

        System.out.println("Original Array : ");
        trw.printArray(arr1);
        trw.trappingRainWater(arr1);
    }
}
