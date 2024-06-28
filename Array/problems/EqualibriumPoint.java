public class EqualibriumPoint {
    public boolean equalibriumPoint(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int leftSum = 0;
        for(int i=0; i<n; i++){
            sum -= arr[i];
            if(leftSum == sum){
                return true;
            }
            leftSum += arr[i];
        }
        return false;   

    }

    public static void main(String[] args) {
        EqualibriumPoint ep = new EqualibriumPoint();
        int arr[] = { 3, 4, 8, -9, 9, 7};
        System.out.println("Equalibrium Point is present : " + ep.equalibriumPoint(arr));

        int arr1[] = { 1, 4, 20, 3, 10, 5 };
        System.out.println("Equalibrium Point is present : " + ep.equalibriumPoint(arr1));
    }
}
