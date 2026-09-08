class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            numbers.add(i);
        }

        int longest = 0;
        for (int i : numbers) {
            int length = 1;
            if (!numbers.contains(i - 1)) {
                while (numbers.contains(i + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest; 
    }
}
