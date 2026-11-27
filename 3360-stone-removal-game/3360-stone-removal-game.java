class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        while(n >= 0) {
            n -= k;
            k--;
        }
        return k % 2 == 0;
    }
}