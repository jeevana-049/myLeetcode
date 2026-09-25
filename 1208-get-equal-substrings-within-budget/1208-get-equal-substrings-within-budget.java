class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ml = 0;
        int l = 0;
        int cost = 0;
        for(int r = 0; r < s.length(); r++) {
            char c1 = s.charAt(r);
            char c2 = t.charAt(r);
            cost += Math.abs((int) c1 - c2);
            while(cost > maxCost) {
                cost -= Math.abs((int) s.charAt(l) - t.charAt(l));
                l++;
            }
            ml = Math.max(ml, r - l + 1);
        }
        return ml;
    }
}