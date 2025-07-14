class Solution{
    public int maxArea(int[] height){
        // Two pointers
        int left = 0;
        int right = height.length;

        // Initialize maximum area

        int max = 0;

        // While left < right, loop

        while (left < right){
            int currentArea = Math.min(height[left] , height[right]) * (right - left); // minimum of height times the difference in width
            max = Math.max(currentArea, max); // replace max if currentArea is greater
        }

        if (height[left] < height[right]){ // this means the left pointer area is less than the right pointer area
            left ++; // move the left pointer forward
        } else {
            right --; // move the right pointer backward
        }

        // return the maximum area
        return max;
    }
}

// Time Complexity: O(n) where n is the length of the array - single pass, the while loop is only traversing the total length of the array, 
// where each iteration, we are either decreasing the left pointer, or increasing the right pointer
// Space Complexity: O(1), no additonal space incurred other than the original input array