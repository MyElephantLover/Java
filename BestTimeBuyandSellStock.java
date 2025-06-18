class Solution{
    public int maxProfit(int [] prices){
        int largestProfit = 0; // if buy and sell on the same day, largestProfit is o

        for (int buyDay = 0; buyDay < prices.length; buyDay ++){
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay ++){
                int currentDifference = prices[sellDay] - prices[buyDay];

                if (currentDifference > largestProfit){
                    largestProfit = currentDifference;
                }
            }
        }
        return largestProfit;
    }

    // Time Complexity: O(n^2) given the nested for loop
    // Space Complexity: O(1)
    // This is a brute force solution
}