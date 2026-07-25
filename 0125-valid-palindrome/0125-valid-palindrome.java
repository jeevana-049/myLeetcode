class Solution {
    public boolean isPalindrome(String s) {
        //s.toLowerCase();
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                //str += Character.toLowerCase(ch);
                str += ch;
            }
        }
        boolean flag = true;
        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return flag;
    }
}