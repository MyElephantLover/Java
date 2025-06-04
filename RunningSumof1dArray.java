public class RunningSumof1dArray {

    public int[] RunningSum(int[] nums){
        // define a new array, called results, with the length, nums.length
        int[] results = new int[nums.length];
        results[0] = nums[0];

        // Set the for loop to start at i=1, so it would not go out of oder

        for (int i = 1; i < nums.length; i ++){
            results[i] = results[i-1] + nums[i];
        }
        return results;

        // time complexity = O(n) as we loop through the entire array
        // space complexity = O(1) as there is not disportional data structure being created

    }
}