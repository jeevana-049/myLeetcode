class Solution {
    public int longestPalindrome(String s) {
        Set<Character> st = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!st.contains(ch)) st.add(ch);
            else {
                st.remove(ch);
                count += 2;
            }
        }
        return count + (st.size() > 0 ? 1 : 0); 
    }
}