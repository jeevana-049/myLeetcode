class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] t = text.split(" ");
        Set<Character> bl = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++) {
            char ch = brokenLetters.charAt(i);
            bl.add(ch);
        }
        int count = t.length;
        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[i].length(); j++) {
                if(bl.contains(t[i].charAt(j))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}