class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if(w > maxWeight) return 0;
        int mc = 0;
        n = n * n;
        while(n > 0 && (mc + 1) * w <= maxWeight) {
            mc++;
            n--;
        }
        return mc;
    }
}