
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        if(k % 2 == 1) {
            nums[0] = -nums[0];
        }
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}