class Solution {
    public boolean isPowerOfThree(int n) {
        int i = 0;
        long val = 1;
        while(val <= n) {
            if(val == n) return true;
            val = (long) Math.pow(3, i);
            i++;
        }
        return false;
    }
}