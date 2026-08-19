class Solution {
    public int maxArea(int[] heights) {
        int leftMax = 0;
        int rightMax = heights.length - 1; 
        int maxArea = 0;
        while (leftMax < rightMax) {
            int curArea = Math.min(heights[leftMax], heights[rightMax]) * (rightMax - leftMax); 

            maxArea = curArea > maxArea ? curArea : maxArea; 

            if (heights[leftMax] < heights[rightMax]) {
                leftMax++;
            } else {
                rightMax--; 
            }
        }
        return maxArea;
    }
}
