class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in = nums[0];
        int dec = nums[0];
        int ic = 1;
        int dc = 1;
        int lms = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                ic++;
                dc = 1;
                lms = Math.max(lms, ic);
            }
            else if(nums[i] < nums[i - 1]) {
                ic = 1;
                dc++;
                lms = Math.max(lms, dc);
            }
            else {
                ic = 1;
                dc = 1;
            }
        }
        return lms;
    }
}