class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int md = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stk.push(ch);
                md = Math.max(md, stk.size());
            }
            if(ch == ')') stk.pop();
        }
        return md;
    }
}