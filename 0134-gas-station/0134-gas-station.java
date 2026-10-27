class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t = 0, tank = 0, s = 0;
        for (int i = 0; i < gas.length; i++) {
            t += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                s = i + 1;
                tank = 0;
            }
        }
        return t < 0 ? -1 : s;
    }
}