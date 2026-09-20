class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count = 0;
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++){
                if(intervals[j][0] <= intervals[i][1]) {
                    count++;
                }
            }
        }
        return count;
    }
}