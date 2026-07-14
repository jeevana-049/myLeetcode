class Solution {
    public int maxVowels(String s, int k) {
        int mv = 0;
        int v = 0;
        for(int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
        }
        mv = v;
        for(int i = k; i < s.length(); i++) {
            char ch = s.charAt(i);
            char pc = s.charAt(i - k);
            if(pc == 'a' || pc == 'e' || pc == 'i' || pc == 'o' || pc == 'u') v--;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
            mv = Math.max(mv, v);
        }
        return mv;
    }
}