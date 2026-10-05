class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ss = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int k = nums.length - 1;
        while(l <= r) {
            int s1 = nums[l] * nums[l];
            int s2 = nums[r] * nums[r];
            if(s1 > s2) {
                ss[k--] = s1;
                l++;
            }
            else {
                ss[k--] = s2;
                r--;
            }
        }
        return ss;
    }
}