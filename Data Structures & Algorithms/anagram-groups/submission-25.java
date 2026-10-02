class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> ans = new HashMap<>();
        for (String s : strs) {
            int[] chars = new int[26];
            for (char c : s.toCharArray()) {
                chars[c - 'a']++; 
            }
            String key = Arrays.toString(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<String>()); 
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
