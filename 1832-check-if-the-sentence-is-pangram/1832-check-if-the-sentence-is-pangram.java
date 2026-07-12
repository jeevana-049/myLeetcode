class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> st =  new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            st.add(sentence.charAt(i));
        } 
        //return st.size() == 26 ? true : false;
        return st.size() == 26;
    }
}