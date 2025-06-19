class Solution{
    public int MaximumProfit(int [] prices){
        int total = 0;

        for (int i = 1; i < prices.length; i ++){
            if (prices[i] > prices[i - 1]){
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }

    // Time Complexity: O(n);
    // Space Complexity: O(1);
    // I do not understand "you could hold at most one share at hand" in the question, and how to reflect that in code

}