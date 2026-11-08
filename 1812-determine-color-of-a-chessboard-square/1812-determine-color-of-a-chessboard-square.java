class Solution {
    public boolean squareIsWhite(String coordinates) {
        int n = (int) coordinates.charAt(0) - 'a' + (int) coordinates.charAt(1) - '0';
        return n % 2 == 0;
    }
}