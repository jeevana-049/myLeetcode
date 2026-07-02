class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int mu = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for(int i = 0; i < boxTypes.length; i++) {
            if(truckSize >= boxTypes[i][0]) {
                mu += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else if(truckSize < boxTypes[i][0]) {
                mu += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
            else break;
        }
        return mu;
    }
}