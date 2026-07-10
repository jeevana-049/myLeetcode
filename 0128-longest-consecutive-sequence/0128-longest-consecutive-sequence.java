class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int x : nums) st.add(x);
        int maxLength = 0;
        for(int val : st) {
            if(!st.contains(val - 1)) {
                int current = val;
                int length = 1;
                while(st.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}