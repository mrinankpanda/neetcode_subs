class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int left = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            while (chars.contains(s.charAt(i))) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(i));
            count = Math.max(count, i - left + 1);
        }

        return count;        
    }
}
