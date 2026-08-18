class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        int maxCount = 0;

        for (int i : nums) {
            ans.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!ans.contains(nums[i] - 1)) {
                int length = 0;
                while (ans.contains(nums[i] + length)) {
                    length++;
                }
                if (length > maxCount) {
                    maxCount = length; 
                }
            }
        }

        return maxCount;
    }
}
