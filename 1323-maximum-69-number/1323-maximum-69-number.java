class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int count = 1;
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '9') {
                str += 9;
            }
            else if(ch == '6' && count == 1) {
                str += '9';
                count--;
            }
            else {
                str += ch;
            }
        }
        return Integer.parseInt(str);
    }
}