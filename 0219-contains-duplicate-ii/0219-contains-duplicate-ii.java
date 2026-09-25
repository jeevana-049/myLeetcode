class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0) return false;
        Set<Integer> st = new HashSet<>();
        int l = 0;
        for(int r = 0; r < nums.length; r++) {
            if(st.contains(nums[r])) return true;
            while(r - l >= k) {
                st.remove(nums[l]);
                l++;
            }
            st.add(nums[r]);
        }
        return false;
    }
}