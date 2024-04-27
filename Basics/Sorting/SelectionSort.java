public class Solution {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    //finding the index of the smallest value in the rest of the array
    int smallest(int[] arr,int k, int n){
        int pos=k, min=arr[k];
        for(int i=k+1;i<n; i++){
            if(arr[i]<min){
                pos = i;
                min = arr[i];
            }
        }
        return pos;
    }
}
