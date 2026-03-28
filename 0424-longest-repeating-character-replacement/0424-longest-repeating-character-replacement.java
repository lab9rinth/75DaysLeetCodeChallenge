class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int l = 0;
        for (int r = 0; r < s.length(); ++r) {
            maxCount = Math.max(maxCount, ++count[s.charAt(r) - 'A']);
            if (maxCount + k < r - l + 1) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return s.length() - l;
    }
}   