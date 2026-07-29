class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        for(int i = 0; i < colors.length - 2; i++) {
            int a = colors[i];
            int b = colors[i + 1];
            int c = colors[i + 2];
            if(a != b && a == c) count++;
        }
        if(colors[0] != colors[colors.length - 1] && colors[0] == colors[colors.length - 2]) count++;
        if(colors[1] != colors[0] && colors[1] == colors[colors.length - 1]) count++;
        return count;
    }
}