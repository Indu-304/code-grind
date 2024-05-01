//simple solution BUT LEARN THE NEXT ONE
class Solution {
    public void sortColors(int[] nums) {
        int c1=0, c0=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
        }
        int i;
        for(i=0; i<c0; i++){
            nums[i]=0;
        }
        for(i=c0; i<c0+c1; i++){
            nums[i]=1;
        }
        for(i=c0+c1; i<nums.length; i++){
            nums[i]=2;
        }
        for(i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}

//DUTCH FLAG ALGORITHM ***
class Solution {
    public void sortColors(int[] nums) {
        int high=nums.length-1, mid=0, low=0;
        while(mid<=high){
            //if 0 then swap with low
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            //if 1 then leave it
            else if(nums[mid]==1)
                mid++;
            //if 2 then swap with high but don't increment mid
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int t;
        t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
}
