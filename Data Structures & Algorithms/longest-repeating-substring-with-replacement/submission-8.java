class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, charFreq[s.charAt(i) - 'A']);
            while ((i - left + 1) - maxFreq > k) {
                charFreq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength; 
    }
}
