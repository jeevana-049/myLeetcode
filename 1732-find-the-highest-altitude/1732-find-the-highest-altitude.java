class Solution {
    public int largestAltitude(int[] gain) {
        int la = gain[0];
        for(int i = 1; i < gain.length; i++) {
            gain[i] = gain[i] + gain[i - 1];
            la = Math.max(la, gain[i]);
        }
        return la >= 0 ? la : 0;
    }
}