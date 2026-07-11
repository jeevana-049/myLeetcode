class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if(!mp.containsKey(ch)) return false;
            mp.put(ch, mp.get(ch) - 1);
            if(mp.get(ch) == 0) mp.remove(ch);
        }
        return true;
    }
}