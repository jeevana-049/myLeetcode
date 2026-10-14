class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] lsum = new int[n];
        lsum[0] = 0;
        int[] rsum = new int[n];
        rsum[n - 1] = 0;
        for(int i = 1; i < n; i++) {
            lsum[i] = lsum[i - 1] + nums[i - 1];
        } 
        for(int i = n - 2; i >= 0; i--) {
            rsum[i] = rsum[i + 1] + nums[i + 1];
        }
        int[] lrdiff = new int[n];
        for(int i = 0; i < n; i++) {
            lrdiff[i] = Math.abs(lsum[i] - rsum[i]);
        }
        return lrdiff;
    }
}