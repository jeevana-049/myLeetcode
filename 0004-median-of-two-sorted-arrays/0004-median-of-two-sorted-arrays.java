class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int o = m + n;
        int[] a = new int[o];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                a[k++] = nums1[i++];
            }
            else {
                a[k++] = nums2[j++];
            }
        }
        while(i < n) a[k++] = nums1[i++];
        while(j < m) a[k++] = nums2[j++];
        double med = 0.0;
        if(o % 2 == 0) {
            return ((a[(o / 2) - 1] + a[o / 2])) / (double) 2;
        }
        return a[o / 2];
    }
}