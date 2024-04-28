public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int l=0, r=0, max=0;
        long sum=a[0];
        while(r<a.length){
            //trimming from left
            while(l<=r && sum>k){
                sum-=a[l];
                l++;
            }
            //checking to update max length
            if(sum == k){
                if(max<r-l+1) max = r-l+1;
            }
            //adding a term to the sum
            r++;
            if(r<a.length) sum+=a[r];
        }
        return max;
    }
}
