class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = 0;
        int missing = 0;
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                int ele = grid[i][j];
                if(st.contains(ele)) repeated = ele;
                else st.add(ele);
            }
        }
        for(int i = 1; i <= grid.length * grid.length; i++) {
            if(!st.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{repeated, missing};
    }
}