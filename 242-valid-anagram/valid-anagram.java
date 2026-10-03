class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) {
        return false;
    }
    StringBuilder sb = new StringBuilder(t);
    for(int i = 0; i < s.length(); i++) {
            String ch = s.charAt(i) + "";
            if(sb.indexOf(ch) == -1) {
                return false;
            }
                sb.deleteCharAt(sb.indexOf(ch));
    }
     
    return true;
    }
}