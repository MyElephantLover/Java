class Solution{
    public int[] productExceptSelf(int[] nums){
        // the reason why the question does not allow us to use division is
        // we could get the result by dividing the product of all the elements by the current index, i.

        // Hence, what we can do is to get the product of all the elements from the left to the index, i.
        // And do the same to get the product of all the elements to the right of the index, i

        // Note: for the index, 0, there is no elements to the left of index, 0, so L[0] = 1
        // For the index, length - 1, there is no elements to the right of the index, length - 1
        // Hence, R[length - 1] = 1

        int length = nums.length;

        int[] L = new int[length];
        int[] R = new int[length];
        
        for (int i = 1; i < length; i ++){
            L[i] = L[i - 1] * nums[i - 1];

            // L[i - 1] already contains the product of all the elements to the index of i - 1.
            // so for  L[i], we only need to multiply L[i - 1] by nums[i - 1]
        }

        // on the R side, we do the same thing but in reverse order
        for (int i = length - 2; i >= 0; i --){
            R[i] = R[i + 1] * nums[i + 1];

            // R[i + 1] already contains the product of all elements to the right of index, i.
            // Hence, for R[i], we only need to multiply R[i + 1] * nums[i + 1]
        }

        // defining answer array

        int[] answer = new int[length];

        // finally, we are getting the product of all elements except self by multiplying L[i] and R[i]

        for (int i = 0; i < length; i ++){
            answer[i] = L[i] * R[i];
        }

        return answer;
    }
}

// Time Complexity: O(n) for n is the number of elements in the array. We iterate over L, we iterate over R, and lastly we iterate over the whole
// array for the answer array

// Space Complexity: O(n) used up by the two intermediate arrays that we constructed to keep track of product of elements to the left and to the right