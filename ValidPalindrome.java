class Solution{
    public boolean isPalindrome(String s){
        // Initialize a StringBuilder to store the result string
        
        StringBuilder sb = new StringBuilder();

        for (char ch: s.toCharArray()){ // loop through each character in the input string "s"
            if (Character.isLetterOrDigit(ch)){ // check if the character is a letter or digit
                builder.append(Character.toLowerCase(ch)); // append the lowercase version of character to builder
            }
        }

        String filteredString = builder.toString(); // this code is converting the content of the StringBuilder object to a string
        String reveresedString = builder.reverse().toString();

        return filteredString.equals(reveresedString);
    }
}

// Time Complexity: O(n) where n is the length of the string s - we iterate thrice through the string. 1) we filter out non-alphanumeric characters
// and convert uppcase to lowercase; 2) when we reverse the string; 3) when we compare the original and the reversed string

// Space Complexity: O(n) we need O(n) additional space to store the filtered string and the reversed string

