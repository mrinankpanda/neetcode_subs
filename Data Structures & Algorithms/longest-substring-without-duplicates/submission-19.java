class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {
            while (ans.contains(s.charAt(right))) {
                ans.remove(s.charAt(left));
                left++;
            }

            ans.add(s.charAt(right));
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}