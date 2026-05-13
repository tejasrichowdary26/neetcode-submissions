class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;

        int left = 0;
        int right = n - 1;

        int stored = 0;

        while (left < right) {

            int maxheight = Math.min(heights[left], heights[right]);

            int width = right - left;

            int area = maxheight * width;

            stored = Math.max(stored, area);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return stored;
    }
}
