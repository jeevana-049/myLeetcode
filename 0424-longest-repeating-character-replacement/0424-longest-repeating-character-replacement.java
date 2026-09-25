class Solution {
    public int characterReplacement(String s, int k) {
        int cr = 0;
        int l = 0;
        int hf = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            hf = Math.max(hf, mp.get(ch));
            while((r - l + 1) - hf > k) {
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                if(mp.get(s.charAt(l)) == 0) mp.remove(s.charAt(l));
                l++;
            }
            cr = Math.max(cr, r - l + 1);
        }
        return cr;
    }
}