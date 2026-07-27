class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mdis = Integer.MAX_VALUE;
        int dis = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                dis = Math.abs(i - start);
                mdis = Math.min(dis, mdis);
                if(mdis == 0) return 0;
            }
        }
        return mdis;
    }
}