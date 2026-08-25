class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        s = s.toLowerCase();
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2);
        int v1 = 0;
        int v2 = 0;
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v1++;
        }
        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v2++;
        }
        return v1 == v2 ? true : false;
    }
}