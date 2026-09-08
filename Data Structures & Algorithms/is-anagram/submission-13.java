class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ans = new int[26];
        
        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            ans[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            ans[c - 'a']--;
        }

        for (int i : ans) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
