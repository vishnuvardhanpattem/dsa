public class MaximumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 0, 0, 1 };
        printMaxConsecutiveFlips(arr);
    }

    // The difference between the groups of 1s and 0s is always 1 or 0
    // How we know to flip the group of 1s or 0s? if the first group element is different from the another group elements we need to flip.
    

    public static void printMaxConsecutiveFlips(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != arr[i]) {
                if (arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println(i - 1);
                }
            }
        }

        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }
}