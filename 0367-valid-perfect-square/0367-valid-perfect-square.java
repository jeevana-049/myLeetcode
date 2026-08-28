class Solution {
    public boolean isPerfectSquare(int num) {
        Set<Long> st = new HashSet();
        for(int i = 1; i <= 46340; i++) {
            st.add((long) i * (long) i);
        }
        return st.contains((long) num) ? true : false;
    }
}