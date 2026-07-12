class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ml = 0;
        int l = 0;
        Set<Character> st = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while(st.contains(ch)) {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(ch);
            ml = Math.max(ml, i - l + 1);
        }
        return ml;
    }
}