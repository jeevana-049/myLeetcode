class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        int j = 1;
        for(int i = 0; i < nums.length / 2; i++) {
            String s = Integer.toString(nums[j]);
            int d = 1;
            for(int k = 0; k < s.length(); k++) d *= 10;
            min = Math.min(min, nums[j - 1] * d + nums[j]);
            j += 2;
        }
        return min;
    }
}