class Solution {
    public int smallestNumber(int n, int t) {
        int sn = 0;
        boolean flag = false;
        int m = n;
        int p = n;
        while(!flag) {
            int pro = 1;
            while(m > 0) {
                int rem = m % 10;
                pro *= rem;
                m /= 10;
            }
            if(pro % t == 0) {
                sn = p;
                flag = true;
            }
            else {
                p++;
                m = p;
            }
        }
        return sn;
    }
}