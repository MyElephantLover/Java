class Solution{
    private static final int[] values = {
        1000,
        900,
        500,
        400,
        100,
        90,
        50,
        40,
        10,
        9,
        5,
        4,
        1,
    };

    private static final String symbols = {
        "M",
        "CM",
        "D",
        "CD",
        "C",
        "XC",
        "L",
        "XL",
        "X",
        "IX",
        "V",
        "IV",
        "I",
    };

    public String IntegertoRoman (int num) {
    StringBuilder sb = new StringBuilder();
    
    // loop through each symbol, stopping if num becomes 0
    for (int i = 0; i < num.length && num > 0; i ++){
        // Repeat while the current symbol still fits into num
        while (values[i] <= num){
            num -= values[i];
            sb.append(symbols[i]);
        }
    }

    return sb.toString();
    }
}

    // The representation should use the largest possible symbols, working from the left
    // therefore, it makes sense to use a Greedy algorithm. 
    // A Greedy algorithm is the algorithm to make the best possible decision at the time being,
    // in this case, taking out the largest possible symbol it can do to represent a given integer,
    // we look for the largest symbol that fits into it, we subtract that, and then look for the largest
    // symbol that fits into the remainder, and so on until the remainder is 0

    // Time Complexity: O(1)
    // Space Complexity: O(n) the size of the memory does not change with the size of the input integer, so remain constant