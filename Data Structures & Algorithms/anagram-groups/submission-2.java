class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            int[] charCount = new int[26];
            for (char c : charArray) {
                charCount[c - 'a']++;
            }
            String key = Arrays.toString(charCount);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
