class Solution {
    public int minOperations(int[] nums) {
        int mo = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                mo++;
            }
        }
        if(nums[nums.length - 1] == 1 && nums[nums.length - 2] == 1) return mo;
        return -1;
    }
}