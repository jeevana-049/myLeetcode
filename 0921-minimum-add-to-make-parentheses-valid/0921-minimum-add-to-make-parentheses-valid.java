class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') stk.push(ch);
            else if(stk.isEmpty()) count++;
            else stk.pop();
        }
        return stk.size() + count;
    }
}