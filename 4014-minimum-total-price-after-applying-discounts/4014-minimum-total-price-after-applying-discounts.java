class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j = discounts.length - 1;
        double val = 0;
        for(int i = prices.length - 1; i >= 0; i--) {
            if(j >= 0) {
                val += (double) (prices[i] * (100 - discounts[j])) / 100;
                j--;
            }
            else val += prices[i];
        }
        return val;
    }
}