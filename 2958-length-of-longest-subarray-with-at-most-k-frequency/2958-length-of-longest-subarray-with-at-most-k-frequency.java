class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int msl = 0;
        int l = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int r = 0; r < nums.length; r++) {
            int num = nums[r];
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            while(mp.get(num) > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                l++;
            }
            msl = Math.max(msl, r - l + 1);
        }
        return msl;
    }
}