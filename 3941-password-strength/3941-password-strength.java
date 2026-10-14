class Solution {
    public int passwordStrength(String password) {
        int[] afreq = new int[26];
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)) {
                afreq[ch - 'a']++;
            }
        }
        int[] Afreq = new int[26];
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)) {
                Afreq[ch - 'A']++;
            }
        }
        int[] dfreq = new int[11];
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch)) {
                dfreq[ch - '0']++;
            }
        }
        int[] sfreq = new int[4];
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(ch == '!'){
                sfreq[0]++;
            }
            if(ch == '@'){
                sfreq[1]++;
            }
            if(ch == '#'){
                sfreq[2]++;
            }
            if(ch == '$'){
                sfreq[3]++;
            }
        }
        int ps = 0;
        for(int i = 0; i < afreq. length; i++) {
            if(afreq [i] != 0) {
                ps += 1;
            }
        }
        for(int i = 0; i < Afreq. length; i++) {
            if(Afreq [i] != 0) {
                ps += 2;
            }
        }
        for(int i = 0; i < dfreq. length; i++) {
            if(dfreq [i] != 0) {
                ps += 3;
            }
        }
        for(int i = 0; i < sfreq. length; i++) {
            if(sfreq [i] != 0) {
                ps += 5;
            }
        }
        return ps;
    }
}