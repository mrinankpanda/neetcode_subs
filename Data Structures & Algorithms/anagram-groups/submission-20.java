class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            int[] frequency = new int[26];
            for (char c : s.toCharArray()) {
                frequency[c - 'a']++;
            }
            String str = Arrays.toString(frequency);
            ans.putIfAbsent(str, new ArrayList<>());
            ans.get(str).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
