import java.math.BigInteger;
class Solution {
    public int sumDecoded(long[] nums) {
        BigInteger m = BigInteger.valueOf(1000000007);
        BigInteger sd = BigInteger.ZERO;
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i] % 10;
            long n = nums[i] / 10;
            String s = Long.toString(n);
            BigInteger a = new BigInteger(s.substring(0, (int) num));
            BigInteger b = new BigInteger(s.substring((int) num));
            BigInteger d = a.modPow(b, m);
            sd = sd.add(d).mod(m);
        }
        return sd.intValue();
    }
}