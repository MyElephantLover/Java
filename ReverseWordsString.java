import java.util.Arrays;
import java.util.Collections;

class Solution{
    public String reverseWords(String s){
        // built-int split and reverse

        // remove leading spaces
        s = s.trim();

        // split by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+")); // split the string s into an array of words
        // "\\s+" is a regex expression that matches with one or more whitespace characters
        Collections.reverse(wordList);
        return String.join(" ", wordList); 
    }
}

// Time Complexity: O(n) while n is the number of characters in the input string
// Space Complexity: O(n) to store the result of split by spaces

