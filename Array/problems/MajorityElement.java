public class MajorityElement {
    
    public int majorityElement(int arr[]){
        int n = arr.length;
        int count = 1;
        int res = 0;

        for(int i=1; i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }else{
                count--;
            }

            if(count==0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for(int i=0; i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }

        if(count<=n/2){
            return -1;
        }

        return arr[res];

    }

    public void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        MajorityElement me = new MajorityElement();

        int arr[] = {8,8,6,6,6,4,6};

        int arr1[] = {3,1,3,3,2};

        System.out.println("Original Array : ");
        me.printArray(arr);
        System.out.println("Majority Element : "+me.majorityElement(arr));

        System.out.println("Original Array : ");
        me.printArray(arr1);
        System.out.println("Majority Element : "+me.majorityElement(arr1));
    }
}
