class Solution {
    public int totalFruit(int[] fruits) {
        int tf = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int l = 0;
        for(int r = 0; r < fruits.length; r++) {
            int fruit = fruits[r];
            mp.put(fruit, mp.getOrDefault(fruit, 0) + 1);
            while(mp.size() > 2) {
                mp.put(fruits[l], mp.get(fruits[l]) - 1);
                if(mp.get(fruits[l]) == 0) mp.remove(fruits[l]);
                l++;
            }
            tf = Math.max(tf, r - l + 1);
        }
        return tf;
    }
}