class Solution {
    public String[] createGrid(int m, int n) {
        char[][] cg = new char[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                cg[i][j] = '#';
                if((i == 0 && j == 0) || (i == m - 1 && j == n - 1)) {
                    cg[i][j] = '.';
                }
                if(i == 0) {
                    cg[i][j] = '.';
                }
                if(j == n - 1) {
                    cg[i][j] = '.';
                }
            }
        }
        String[] cgrid = new String[m];
        Arrays.fill(cgrid,"");
        int k = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                cgrid[k] += cg[i][j];
            }
            k++;
        }
        return cgrid;
    }
}