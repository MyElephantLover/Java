class Solution{
   public int RemoveElement(int [] nums, int val){
    // use two pointers, reader and writer pointer, if reader pointer at the position where the value is equal to the writer pointer
    // the reader pointer continue moving to the next one, while the writer pointer stops writing to nums at the writer pointer

    int reader = 0;
    int writer = 0;
    int n = nums.length;

    while (reader < n){ // meaning the reader pointer has not reached the end of nums
        if (nums[reader] == val){
            reader ++;
        } else {
            nums[writer] = nums[reader];
            reader ++;
            writer ++;
        }
    }
    return writer;
   }
}



// Simplying the above code with the idea that the reader pointer always increments

class Solution{
    public int RemoveElement(int [] nums, int val){
        int writer = 0;
        int n = nums.length;

        for (int reader = 0; reader < n; reader ++){
            if (nums[reader] != val){
                nums[writer++] = nums[reader];
            }
        }
        return writer;
        }

        // Time Complexity: O(n): we are reading the entire array only once
        // Space Complexity: O(1): we modify the array in place as required, so auxiliary space required is constant 
}

