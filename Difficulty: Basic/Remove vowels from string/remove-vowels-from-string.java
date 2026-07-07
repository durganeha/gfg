class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            str.append(ch);
        }
        return str.toString();
    }
}