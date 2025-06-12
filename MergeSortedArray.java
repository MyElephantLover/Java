class Solution{
    public void merge(int [] nums1, int m, int [] nums2, int n){
        // we create two reader pointers, r1 and r2, they iterate nums1 and nums2 respectively
        // we assign a writer pointer to move from the back of nums1, and pick the maximum value among
        // nums1[r1] and nums2[r2] to assign that to nums1[w]

        int r1 = m - 1;
        int r2 = n - 1;

        for (int w = m + n - 1; w >=0; w --){
            if (r1 >= 0 && r2 >= 0){
                // the above means both reader pointers have not exhausted
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--]: nums2[r2--];
                // the above means we assign nums1[w] the maximum value b/w nums1[r1] and nums2[r2]
                // and r1 decrements after the assignment, this is post-decrement
            } else if (r1 >= 0){
                nums1[w] = nums1[r1--];
            } else {
                nums1[w] = nums2[r2--];
            }
        }        
        return;
    }
    // Time Complexity = O(m+n);
    // Space Complexity = O(1); because we do not use any auxiliary space
}


// Another approach 
// It replace the dummy values after the m elements in nums1 with the elements in nums2

class Solution{
    public void merge(int [] nums1, int m, int [] nums2, int n){

        for (int i = 0 ; i < n; i ++){
            // i being the index of nums1
            nums1[i + m] = nums2[i]; 
        }
        Array.sort(nums1);
        return;
    }

    // Time Complexity: O((m+n)log(m+n));
    // Space Complexity: O(log(m+n))
}