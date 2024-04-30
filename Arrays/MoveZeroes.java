class Solution {
    public void moveZeroes(int[] nums) {
        int t, j=-1;
        //finding the first 0
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j == -1) return; //if no zeroes r found
        //swapping zeroes with non-zero numbers
        for(int i=j+1; i<nums.length; i++){
            if(nums[i]!=0){
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}
