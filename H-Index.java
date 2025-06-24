import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
   public int hindex(int[] citations){
    // sorting the array
    Arrays.sort(citations);
    
    // finding h-index by linear search
    int i = 0;

    while (i < citations.length && citations[citations - 1 - i] > i){
        i ++;
    }

    return i; // after the while loop, i = i' + 1
   }

   // Time Complexity: O(n*longn) comparison sorting dominates time complexity, linear search is O(n). 
   // Binary sorting won't affect this asymptotic time complexity 
   // Space Complexity: O(1) most libraries use heap sort which costs O(1) extra space in the worst case
}
