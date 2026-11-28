class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> mp = new HashMap<>();
        char ch = 'a';
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if(Character.isLetter(c) && !mp.containsKey(c)) {
                mp.put(c, ch);
                ch++;
            }
        }
        String dc = "";
        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(Character.isLetter(c)) dc += mp.get(c);
            else dc += c;
        }
        return dc;
    }
}