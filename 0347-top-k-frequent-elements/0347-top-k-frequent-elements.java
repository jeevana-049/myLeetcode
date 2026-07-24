class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x : nums) {
            mp.put(x, mp.getOrDefault(x,0) + 1);
        }
        List<Map.Entry<Integer,Integer>> lst = new ArrayList<>(mp.entrySet());
        Collections.sort(lst, (a,b) -> b.getValue() - a.getValue());
        int[] tkf = new int[k];
        for(int i = 0; i < k; i++) {
            tkf[i] = lst.get(i).getKey();
        }
        return tkf;
    }
}