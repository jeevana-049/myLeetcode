class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mr = Integer.MAX_VALUE;
        int l = 0;
        int w = 0;
        for(int r = 0; r < blocks.length(); r++) {
            char ch = blocks.charAt(r);
            if(ch == 'W') w++;
            if(r - l == k) {
                if(blocks.charAt(l) == 'W') w--;
                l++;
            }
            if(r - l + 1 == k) mr = Math.min(mr, w);
        }
        return mr;
    }
}