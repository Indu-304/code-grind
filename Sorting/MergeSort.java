import java.util.ArrayList;

public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        if (l>=r) return;
        int mid = (l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void merge(int[] arr, int l, int mid, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        //left n right starting indices
        int left = l;
        int right = mid+1;
        while(left <= mid && right <= r){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
      //dump remaining values
        while(left <= mid){
            temp.add(arr[left]);
                left++;
        }
        while(right <= r){
            temp.add(arr[right]);
                right++;
        }

        //store values in the array from arraylist
        for(int i=l; i<=r; i++){
            arr[i] = temp.get(i-l);
        }
    }
}
