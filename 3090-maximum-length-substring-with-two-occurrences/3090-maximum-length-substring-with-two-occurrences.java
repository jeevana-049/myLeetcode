class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int mls = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            while(mp.get(ch) > 2) {
                char left = s.charAt(l);
                mp.put(left, mp.getOrDefault(left , 0) - 1);
                if(mp.get(left) == 0) mp.remove(left);
                l++;
            }
            mls = Math.max(mls, r - l + 1);
        }
        return mls;
    }
}