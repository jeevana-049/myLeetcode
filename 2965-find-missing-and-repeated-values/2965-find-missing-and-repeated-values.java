class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] freq = new int[grid.length * grid.length + 1];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                freq[grid[i][j]]++;
            }
        }
        int[] mr = new int[2];
        for(int i = 1; i < freq.length; i++) {
            if(freq[i] == 2) mr[0] = i;
            else if(freq[i] == 0) mr[1] = i;
        }
        return mr;
    }
}