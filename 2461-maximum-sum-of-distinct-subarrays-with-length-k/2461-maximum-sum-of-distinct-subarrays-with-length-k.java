class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        int l = 0;
        long sum = 0;
        long mss = 0;
        for(int r = 0; r < nums.length; r++) {
            while(st.contains(nums[r])) {
                st.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            st.add(nums[r]);
            sum += nums[r];
            if(r - l + 1 > k) {
                st.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            if(r - l + 1 == k) {
                mss = Math.max(mss, sum);
            }
        }
        return mss;
    }
}