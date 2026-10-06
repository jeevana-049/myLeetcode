class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') stk.push(ch);
            else {
                if(stk.isEmpty() || stk.peek() == ')') stk.push(ch);
                else stk.pop();
            }
        }
        return stk.size();
    }
}