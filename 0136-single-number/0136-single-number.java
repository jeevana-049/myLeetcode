class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums) {
            if(st.contains(num)) st.remove(num);
            else st.add(num);
        }
        int sn = 0;
        for(int val : st) sn = val;
        return sn;
    }
}