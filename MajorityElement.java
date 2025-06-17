class Solution{
    public int majorityElement(int [] nums){
        int majorityElement = nums.length / 2; 

        for (int num : nums){
            int count = 0;

            for (elem: nums){ // loop through each element in nums
                if (elem == num){ // check whether the current element is equal to a specific value num 
                    count +=1;
                }
            }

            if (count > majorityElement){ // meaning every element is unique in nums
                return nums.length;
            }
        }
        return -1;

    }
// This is a brute force solution that I can understand so far
// Time Complexity: O(n^2) since we have 2 for loops
// Space Complexity: O(1)

}