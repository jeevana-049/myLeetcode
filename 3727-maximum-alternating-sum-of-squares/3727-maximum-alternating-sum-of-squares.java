class Solution {
    public long maxAlternatingSum(int[] nums) {
        long esum = 0;
        long osum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                nums[i] = -nums[i];
            }
            }
        Arrays.sort(nums);
        for(int i = 0; i < (nums.length) / 2; i++) {
                esum += nums[i] * nums[i];
        }
        for (int i = ((nums.length) / 2); i < nums.length; i++) {
                osum += nums[i] * nums[i];
        }
                return osum - esum;
            
    }
}