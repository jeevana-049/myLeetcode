class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] d = new int[code.length];
        if(k == 0) return d;
        int[] a = new int[2 * code.length];
        for(int i = 0; i < code.length; i++) {
            a[i] = code[i];
            a[code.length + i] = code[i];
        }
        if(k > 0) {
            for(int i = 0; i < code.length; i++) {
                int sum = 0;
                for(int j = i + 1; j < i + k + 1; j++) {
                    sum += a[j];
                }
                d[i] = sum;
            }
        }
        if(k < 0) {
            for(int i = 0; i < code.length; i++) {
                int sum = 0;
                for(int j = code.length - 1 + i; j >= code.length + k + i; j--) {
                    sum += a[j];
                }
                d[i] = sum;
            } 
        }
        return d;
    }
}