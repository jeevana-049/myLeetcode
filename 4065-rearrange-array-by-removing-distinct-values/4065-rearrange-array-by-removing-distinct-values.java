class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
            freq[nums[i]]++;
        }
        int[] ra = new int[nums.length];
        int j = 0;
        while(st.size() > 0) {
            for(int i = 0; i <= 100; i++) {
                if(freq[i] > 0) {
                    ra[j++] = i;
                    freq[i]--;
                    if(freq[i] == 0) st.remove(i);
                }
            }
        }
        return ra;
    }
}