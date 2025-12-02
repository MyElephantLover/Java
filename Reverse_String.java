class Solution{
    public void reverseString(char[] s){
        // initialize two pointers
        // Use iteration approach

        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char tmp = s[left]; // tmp would change based on the left pointer moving to the right
            s[left ++] = s[right]; // left pointer moves one position to the right
            s[right --] = tmp; // right pointer moves one position to the left
        }

    }

}


// Time Complexity: O(n) where n is the length of the string, s
// Space Complexity: O(1) this is a constant space solution


