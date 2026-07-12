class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> st = new HashSet<>();
        /*for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(st.contains(entry.getValue())) return false;
            st.add(entry.getValue());
        }*/
        for(int value : mp.values()) {
            if(st.contains(value)) return false;
            st.add(value);
        }
        return true;
        //return mp.size() == st.size() ? true : false;
    }
}