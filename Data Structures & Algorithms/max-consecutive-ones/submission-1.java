class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0, max = -1;  
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++; 
            } else {
                counter = 0; 
            }
            if (counter > max) max = counter;
        }
        return max;
    }
}