package Searching.problems;

public class CountOccInSortedArr {

    public int countOcc(int arr[], int n, int num){
        IndexOfFirstOccInSortedArr iof = new IndexOfFirstOccInSortedArr();
        IndexOfLastOccInSortedArr iol = new IndexOfLastOccInSortedArr();

        int firstIdx = iof.firstOcc(arr, n, num);

        if(firstIdx == -1)
            return 0;

        int lastIdx = iol.lastOcc(arr, n, num);

        return lastIdx-firstIdx+1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 10, 10, 20, 20, 40 };
        int num = 10;
        CountOccInSortedArr bs = new CountOccInSortedArr();
        System.out.println("Count of occurence in array: " + bs.countOcc(arr, arr.length, num));
    }

}
