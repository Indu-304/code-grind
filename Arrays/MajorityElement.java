//Using HashMap
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mapp = new HashMap<>();
        //Inserting in hash map takes NlogN time
        for(int i=0; i<nums.length; i++){
            if(mapp.containsKey(nums[i])){
                mapp.put(nums[i], mapp.get(nums[i])+1);
            }
            else{
                mapp.put(nums[i], 1);
            }
        }
        //I can't remember this shi
        for(Map.Entry<Integer, Integer> e: mapp.entrySet()){
            if(e.getValue() > (nums.length/2))
                return e.getKey();
        }
        return 0;
    }
}

//Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int count=0, element=nums[0];//assume that the first element is the majority
        for(int i=0; i<nums.length; i++){
            //change to next element after everything cancels out
            if(count==0){
                element=nums[i];
            }
            if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
}
