class Solution {
    public int maxArea(int[] heights) {
        int left = 0; int right = heights.length - 1;
        int maxCapacity = 0;
        int currentCapacity = 0;
        while (left < right) {
            currentCapacity = (right - left) * (Math.min(heights[left], heights[right]));
            maxCapacity = Math.max(maxCapacity, currentCapacity);
            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxCapacity;
    }
}
