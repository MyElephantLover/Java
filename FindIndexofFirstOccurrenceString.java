class Solution{
    public int strStr(String haystack, String needle){
        // This solution is using a substring search with a brute-force sliding window approach

        int m = needle.length();
        int n = haystack.length();

        for (int windowStart = 0; windowStart < n - m; windowStart ++){ // the staring index of the sliding window in haystack
            for (int i = 0; i < m; i ++){
                if (needle.charAt(i) != haystack.charAt(windowStart + i)){
                    break; // at any point the character not match, break the inner loop
                }
                if (i == m - 1){ // this means there is a full match
                    return windowStart;
                }
            }
        }
        return -1;
    }
}

// Time Complexity: O(|T|) where T is the length of the target string
// Space Complexity: O(|T|)

