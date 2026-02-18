class Solution {
    public String toggleCase(String s) {
        // code here
        char[] tc = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                tc[i] = Character.toUpperCase(ch);
            } else {
                tc[i] = Character.toLowerCase(ch);
            }
        }
        return new String(tc);
    }
}
