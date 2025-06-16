class Solution{
    public int removeDuplicates(int [] nums){
        // apply two pointers - to remove duplicates IN PLACE because we pass by reference in Java
        // to remove duplicates in place means we are not creating extra space

        int n = nums.length;
        int insertIndex = 1; // because the index 0 will always be the unique one

        if (n == 0){
            return 0;
            // consider edge case
        }

        for (int i = 0; i < n; i ++){
            if (nums[i] != nums[i - 1]){ // meaning nums[i] is not a duplicate
                nums[insertIndex] = nums[i];
                insertIndex ++;
            }
        }
        return insertIndex;
    }
    // Time Complexity: O(n);
    // Space Complexity: O(1);
}