//Dynamic Programming
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum>max) max=sum;
            //We assume that the max sum won't be negative. If -ve, then reset sum to 0
            if(sum<0) sum=0;
        }
        return max;
    }
}
