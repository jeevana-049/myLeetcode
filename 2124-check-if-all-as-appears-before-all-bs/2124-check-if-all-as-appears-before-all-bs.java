class Solution {
    public boolean checkString(String s) {
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'b') {
                idx = i;
                break;
            }
            else idx = i;
        }
        for(int i = idx + 1; i < s.length(); i++) {
            if(s.charAt(i) == 'a') return false;
        } 
        return true;
    }
}