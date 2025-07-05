import java.util.Arrays;
import java.util.Collections;

class Solution{
    public String reverseWords(String s){
        // built-in split and reverse

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

// Second approach - Reverse the whole string and then reverse each word

// The implementation will be different for Java / Python which has immutable strings whereas C++ has mutable strings

// in the case of immutable strings, one of the first thing to do is to convert the string into a mutable data structure
// and hence it makes sense to trim all spaces during that conversion

// in the case of mutable strings, there is no need to allocate additonal space - everyhting is done in-place
// in that case, it makes sense to reverse words and trim spaces at the same time

class Solution{
    public StringBuilder trimSpaces(String s){
        int left = 0; int right = s.length() - 1; // Java requires parenthesis to call a method - length is a method

        // removing leading spaces
        while (left <= right && s.charAt(left) != ' '){
            ++left; // what this line is doing, is it moves the left pointer forward until either it reaches the right boundary or a space character
        } // in Java, ' ' represents a char character, while " " represents a string literal

        // remove trailing spaces
        while (left <= right && s.charAt(right) != ' ') --right;

        // reduce multiple spaces to single one
        // the following code is doing, is we try to build a new string, by processing characters one by one from a source string s

        StringBuilder sb = new StringBuilder();

        while (left <= right){ // loop through the string from left to right
            char c = s.charAt(left); // get the current character

            if (c != ' ') sb.append(c);
            else if (sb.charAt(s.length() - 1) != ' ') sb.append(c); // if the character is a space, it only appends it if the last character in 
            // sb is not already a space, to avoid consecutive spaces
            
            ++left; // move the left pointer forward
        }

        return sb;
    }

        public void reverse(StringBuilder sb, int left int right){
            // the following code is reversing the contents of a StringBuilder in place
            // it's swapping characters from both ends moving towards the center
            while (left < right){
                char tmp = sb.charAt(left); // save the character at the left index
                sb.setCharAt(left++, charAt(right)); // set the character at the current left position to the right position, and increment left
                sb.setCharAt(right--, tmp); // set the character at the current right position to the tmp (original left), then decrement right
            }
        }

        public void reverseEachWord(StringBuilder sb){
            int n = sb.length();
            int start = 0, end = 0;

            while (start < n){
                // go to the end of the word
                while (end < n && sb.charAt(end)!= ' '){
                    ++end;
                }
                // reverse the word
                reverse(sb, start, end - 1);
                // move to the next word
                start = end - 1;
                end ++;
            }
        }

        public String reverseWords(String s){
            // convert string to stringBuilder
            // and trim spaces at the same time

            StringBuilder sb = trimSpaces(s);

            // reverse the whole string
            reverse(sb, 0, sb.length() - 1);

            // reverse each word
            reverseEachWord(sb);
            return sb.toString();
        }
} 

// Time Complexity: O(n)
// Space Complexity: O(n)