class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) mp1.put(nums1[i], mp1.getOrDefault(nums1[i], 0) + 1);
        for(int i = 0; i < nums2.length; i++) mp2.put(nums2[i], mp2.getOrDefault(nums2[i], 0) + 1);
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(mp2.containsKey(nums1[i])) c1++;
        }
        for(int i = 0; i < nums2.length; i++) {
            if(mp1.containsKey(nums2[i])) c2++;
        }
        return new int[]{c1, c2};
    }
}