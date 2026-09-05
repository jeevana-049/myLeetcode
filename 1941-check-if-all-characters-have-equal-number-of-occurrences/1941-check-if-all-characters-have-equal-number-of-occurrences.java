class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int f = -1;
        for(int i = 0; i < 26; i++) {
            if(freq[i] == 0) continue;
            else {
                f = freq[i];
                break;
            }
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0 && freq[i] != f) return false;
        }
        return true;
    }
}