class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[nums.length - 1] - nums[0] <= 2 * k) return 0;
        return (nums[nums.length - 1] - k) - (nums[0] + k);
    }
}