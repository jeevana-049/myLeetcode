class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) str += ch;
        }
        int i = 0;
        int j = str.length() - 1;
        while(i <= j) {
            if(str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}