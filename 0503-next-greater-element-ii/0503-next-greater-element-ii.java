class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = (n * 2) - 1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() <= nums[i % n]) {
                stk.pop();
            }
            if(i < n) {
                if(stk.isEmpty()) nge[i] = -1;
                else nge[i] = stk.peek();
            }
            stk.push(nums[i % n]);
        }
        return nge;
    }
}