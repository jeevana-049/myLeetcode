class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int o = m + n;
        double[] a = new double[o];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                a[k++] = (double) nums1[i++];
            }
            else {
                a[k++] = (double) nums2[j++];
            }
        }
        while(i < n) a[k++] = (double) nums1[i++];
        while(j < m) a[k++] = (double) nums2[j++];
        double med = 0.0;
        if(o % 2 == 0) {
            med = ((a[(o - 1) / 2] + a[o / 2])) / 2;
        }
        else med = a[o / 2];
        return med;
    }
}