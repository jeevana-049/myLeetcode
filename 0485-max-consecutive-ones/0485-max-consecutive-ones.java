class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int mones = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) ones++;
            else {
                if(ones > mones) mones = ones;
                ones = 0;
            }
        }
        if(ones > mones) mones = ones;
        return mones;
    }
}