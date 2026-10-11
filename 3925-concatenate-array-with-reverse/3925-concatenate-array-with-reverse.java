class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] cwr = new int[2 * nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            cwr[j++] = nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            cwr[j++] = nums[i];
        }
        return cwr;
    }
}