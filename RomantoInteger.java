import java.util.HashMap;

public class RomantoInteger {
   static Map <String, Integer> values = new HashMap<>();

   static {
    values.put("M", 1000);
    values.put("D", 500);
    values.put("C", 100);
    values.put("L", 50);
    values.put("X", 10);
    values.put("V", 5);
    values.put("I", 1);
   }

   // recall that each symbol adds its own value, except that when a smaller valued symbol is before a larger valued symbol
   // In those cases, instead of adding both symbols to the total, we need to substract the small from the large
   // adding that instead
   
   // In this question, we assume all input is valid. In real interview question, always not make any assumption before asking for clarification

   public int romanToInt(String s){
    int sum = 0;
    int i = 0;
    while (i < s.length()){
        String currentSymbol = s.substring(i, i + 1); // two adjacent symbols
        int currentValue = values.get(currentSymbol); // the value from the HashMap
        
        int nextValue = 0;
        if (i + 1 < s.length()){
            String nextSymbol = s.substring(i + 1, i + 2);
            nextValue = values.get(nextSymbol);
        }

        if (currentValue < nextValue){ // if the preceding symbol is smaller
            sum += (nextValue - currentValue);
            i += 2;
        } else {
            sum += currentValue;
            i += 1;
        }
    }

    return sum;
   }

   // Time Complexity: O(1)
   // Space Complexity: O(1)
}
