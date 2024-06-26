class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k<0) k+=nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    public void reverse(int[] arr, int i, int j) {
        int li = i, ri = j, temp;
        while(li<ri){
            temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
        
    }
}
