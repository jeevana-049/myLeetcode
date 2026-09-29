class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int nrb = 0;
        int l = 0;
        int r = people.length - 1;
        while(l <= r) {
            if(people[l] + people[r] <= limit) {
                nrb++;
                l++;
                r--;
            }
            else {
                nrb++;
                r--;
            }
        }
        return nrb;
    }
}