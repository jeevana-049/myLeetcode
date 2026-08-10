class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = 0;
        int missing = 0;
        int sum = 0;
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                int ele = grid[i][j];
                sum += ele;
                if(st.contains(ele)) repeated = ele;
                else {
                    st.add(ele);
                }
            }
        }
        //expectedSum + repeated - missing = actualSum
        int n = grid.length;
        int expS = ((n * n) * ((n * n) + 1)) / 2;
        missing = expS + repeated - sum;
        return new int[]{repeated, missing};
    }
}