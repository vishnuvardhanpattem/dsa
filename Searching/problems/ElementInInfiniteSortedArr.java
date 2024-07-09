package Searching.problems;

public class ElementInInfiniteSortedArr {
    
    public int search(int arr[], int num){
        BinarySearch bs = new BinarySearch();
        if(arr[0] == num)
            return 0;
        int i=1;
        while(arr[i] < num){
            i = i*2;
        }

        if(arr[i] == num)
            return i;
        
        return bs.binarySearch(arr, num, i/2 + 1, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,10,15,20,40,60,80,100,200,500,1000,5000};
        ElementInInfiniteSortedArr getEle = new ElementInInfiniteSortedArr();
        System.out.println("\nElement found at index : " + getEle.search(arr, 100));
    }

}
