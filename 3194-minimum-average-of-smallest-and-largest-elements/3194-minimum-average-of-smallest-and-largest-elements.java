class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        double ma = Double.MAX_VALUE;
        while(l < r) {
            double avg = (nums[l] + nums[r]) / (double) 2;
            ma = Math.min(ma, avg);
            l++;
            r--;
        }
        return ma;
    }
}