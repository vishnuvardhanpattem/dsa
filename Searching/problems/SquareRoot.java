package Searching.problems;

// A number whose square root is nearer to perfect square , example 12 is nearer sqrt of 9
public class SquareRoot {
    public int squareRoot(int num){
        int low = 1;
        int high = num;
        int res = -1;

        while(low <= high){
            int mid = (low+high)/2;
            int midSq = mid*mid;
            if(midSq == num)
                return mid;
            else if(midSq > num)
                high = mid -1;
            else{
                low = mid + 1;
                res = mid;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SquareRoot sqr = new SquareRoot();
        System.out.println("\nSquare root of num nearer or equal to : " + sqr.squareRoot(16));
        System.out.println("Square root of num nearer or equal to : " + sqr.squareRoot(15));
    }

}
