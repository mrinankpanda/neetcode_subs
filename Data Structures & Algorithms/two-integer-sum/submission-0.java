class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (ans.getOrDefault(complement, -1) != -1) {
                return new int[] {ans.getOrDefault(complement, -1), i};
            } else {
                ans.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
