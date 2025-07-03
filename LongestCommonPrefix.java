public class LongestCommonPrefix {
    public String LongestCommonPrefix(String[] strs){
        // horizontal scanning

        if (strs.length == 0) return "";

        // initialize prefix as the first string of the array

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i ++) while (
            strs[i].indexOf(prefix) != 0 
        ) {
            prefix = prefix.substring(0, prefix.length() - 1);
            // start looping the rest of the array from the second string
            // as long as the current strs[i] does not start with the current prefix, 
            // shorten the prefix by removing the last character 

            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }
}

// Time Complexity: O(S) where S is the sum of all characters in all the strings
// Space Complexity: O(1) we only used constant extra space

