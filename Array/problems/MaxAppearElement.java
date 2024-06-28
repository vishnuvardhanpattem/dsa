public class MaxAppearElement {
    
     public int maxAppearElement(int left[], int right[],int n){
         int freq[] = new int[101];

         for(int i=0; i<n;i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
         }
         int res = 0;
         for(int i=1; i<100;i++){
            freq[i] = freq[i-1] + freq[i];
            if(freq[i]>freq[res]){
                res = i;
            }
         }

         return res;
     }

     public static void main(String[] args) {
        MaxAppearElement mae = new MaxAppearElement();
        int left[] = {1,2,4};
        int right[] = {4,5,7};

        System.out.println("Maximum appearing element is : " + mae.maxAppearElement(left, right, 3));
     }
}
