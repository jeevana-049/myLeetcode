class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = new int[arr.length];
        for(int i = 0; i < arr.length; i++) a[i] = arr[i];
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.sort(a);
        int j = 1;
        for(int i = 0; i < arr.length; i++) {
            if(!mp.containsKey(a[i])) {
                mp.put(a[i], j);
                j++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = mp.get(arr[i]);
        }
        return arr;
    } 
}