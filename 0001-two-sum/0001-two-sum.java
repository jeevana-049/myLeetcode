class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ts = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if(mp.containsKey(b)) {
                ts[1] = mp.get(b);
                ts[0] = i;
                break;
            }
            mp.put(a,i);
        }
        return ts;
    }
}