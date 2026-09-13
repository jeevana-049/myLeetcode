class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i++) {
            int k = rowShift[i] % n;
            for(int j = 0; j < n; j++) {
                int col = (j - k + n) % n;
                ans[i][col] = grid[i][j];
            }
        }
        int[][] res = new int[n][n];
        for(int j = 0; j < n; j++){
            int k = colShift[j] % n;
            for(int i = 0; i < n; i++) {
                int row = (i - k + n) % n;
                res[row][j] = ans[i][j];
            }
        }
        return res;
    }
}