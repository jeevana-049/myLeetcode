class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int v = tickets[k];
        int trtb = 0;
        for(int i = 0; i <= k; i++) {
            if(tickets[i] > v) {
                trtb += v;
            }
            else trtb += tickets[i];
        }
        for(int i = k + 1; i < tickets.length; i++) {
            if(tickets[i] >= v) {
                trtb += v - 1;
            }
            else trtb += tickets[i] ;
        }
        return trtb;
    }
}