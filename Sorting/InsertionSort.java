public class Solution {
    public static void insertionSort(int[] arr, int size) {
        int t;
      //*** i<=size-1 ***
        for(int i=0; i<=size-1; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
                j--;
            }
        }
      //print
    }
}
