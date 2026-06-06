class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; 
        int[] brandNew = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            brandNew[i] = nums[i];
            brandNew[i + n] = nums[i]; 
        }
        return brandNew;
    }
}