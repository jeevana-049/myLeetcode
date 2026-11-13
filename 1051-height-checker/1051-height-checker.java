class Solution {
    public int heightChecker(int[] heights) {
        int[] h = new int[heights.length];
        for(int i = 0; i < heights.length; i++) h[i] = heights[i];
        Arrays.sort(h);
        int hc = 0;
        for(int i = 0; i < heights.length; i++) {
            if(h[i] != heights[i]) hc++;
        }
        return hc;
    }
}