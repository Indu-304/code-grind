class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (mapp.containsKey(complement)) {
                return new int[]{mapp.get(complement), i};
            }
            mapp.put(nums[i], i);
        }
        return new int[]{}; // No solution found
    }
}
