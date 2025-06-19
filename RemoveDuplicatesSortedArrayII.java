class solution{
    public int RemoveDuplicatesSortedArray(int [] nums){
        // we use two pointers - reader pointer to iterate through the array
        // writer pointer to track if the duplicated count reaches 2 (we use count to track duplicated occurence)
        // if it does, go to the next element
        // if it does not, replace the writer pointer with the reader pointer, and reset count to 1
        int reader = 1;
        int writer = 1;
        int count = 1;

        if (nums.length == 0){
            return 0;
        }

        while (reader < nums.length){
            if (nums[reader] == nums[reader - 1]){ // the current is the same as the previous element
                count ++;
                if (count > 2){
                    reader ++;
                    continue;
                } 
            } else { // the current element is unique
                nums[writer] == nums[reader];
                count = 1; // reset counter
            }

            nums[writer] = nums[reader];
            reader ++;
            writer ++;
        }
        // Java arrays cannot be resized as C++ vectors
        // so we return the size directly

        return writer;

        // Time Complexity: O(n^2), since the deletion takes O(n). In the worst case that all elements are the same, each unwanted duplicate takes
        // n-2 deletion. Hence, the total Time Complexity would be O(n) + O(n^2) = O(n^2)

        // Space Complexity: O(1)
    }
}