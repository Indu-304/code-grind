public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        int t;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
      //print
    }
}
