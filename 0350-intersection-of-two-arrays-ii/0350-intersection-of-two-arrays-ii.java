class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<>();
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                lst.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        int[] inter = new int[lst.size()];
        for(int k = 0; k < lst.size(); k++) inter[k] = lst.get(k);
        return inter; 
    }
}