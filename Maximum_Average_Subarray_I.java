class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        // the question is asking any k elements with the maximum average value
        // set a cumulative sum array, sum, which is used to store the sum of the elements in the array
        // from the first index to the ith index
        
        int[] sum = new int[nums.length];
        
        sum[0] = nums[0]; // sum is a prefix sum array which must start storing the first element 
        
        for (int i = 1; i < nums.length; i ++){
            sum[i] = sum[i - 1] + nums[i]; // the sum to the previous index plsu nums[i]
        }
        
        double res = sum[k - 1] * 1.0 / k;
        
        for (int i = k; i < nums.length; i ++){
            res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k); // this loop is the sliding window to calculate the average sum of the array of size k, where i marks the end of the current window, and each iteration is from index i-k+1 to index i
        }
        
        return res;
    }
}

// Time Complexity: O(n), we iterate over the array nums once of length
// n once to fill the sum array. Then we iterate over n - k
// elements of sum to determin the required result

// Space Complexity: O(n) we make use of sum array of length n 
// to store the cumulative sum

