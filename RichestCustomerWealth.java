public class RichestCustomerWealth{
    public int MaximumWealth(int[][] accounts){
        int MaxWealthSoFar = 0;
        for (int[] customer:accounts){
            int CurrentcustomerWealth = 0;
            for (int bank: customer){
                CurrentcustomerWealth +=bank;
            }
            MaxWealthSoFar = Math.max(CurrentcustomerWealth, MaxWealthSoFar);
        }
        return MaxWealthSoFar;
    }
    // Time Complexity = O(m x n);
    // Space Complexity = O(1)
}