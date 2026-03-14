class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length() != t.length())
        {
            return false;
        }
        for(int j=0; j<s.length(); j++)
        {
            count[s.charAt(j)-'a']++;
            count[t.charAt(j)-'a']--;
        }
        for(int val : count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}