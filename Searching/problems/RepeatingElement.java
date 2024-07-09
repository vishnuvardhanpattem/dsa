package Searching.problems;

//Zeros should not be present in the array
public class RepeatingElement {
    
    public int findRepeating(int arr[], int n){
        int slow = arr[0], fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        RepeatingElement re = new RepeatingElement();

        int arr[] = {1, 3, 2, 4, 6, 5, 7, 3};
        System.out.println("Repeating element is : " + re.findRepeating(arr, arr.length));
    }
}
