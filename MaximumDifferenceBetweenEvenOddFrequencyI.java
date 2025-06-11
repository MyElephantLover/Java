import java.util.HashMap;

class Solution{
    public int maxDifference(String s){
        Map<character, Integer> c = new HashMap<>();

        /*
        HashMap.put() method add a key-value pair to the map or update values which associated with a 
        a key-value pair
        */

        for (char ch: s.toCharArray()){
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        };

        // getOrDefault method retrieves a value from a key-value pair if the key exisits, or return a default 
        // value that we specify

        int maxOdd = 1;
        int minEven = s.length();

        for (int value : c.values()){ // set value as lopping the HashMap
            if (value % 2 == 1){
                maxOdd = Math.max(maxOdd, value);
            } else {
                minEven = Math.min(minEven, value);
            }
        }
        return maxOdd - minEven;

        // Time Complexity: O(n) where n is the size of the string s
        // Space Complexity: O(sigma) where sigma dictates the size of the character set
    }
}