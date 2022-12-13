class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0, i = 0, j = n-1;
        while(i<j){
            int currArea = (j-i) * Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, currArea);
            if(height[i]<height[j]) i ++;
            else j--;
        }
        return maxArea;
    }
}