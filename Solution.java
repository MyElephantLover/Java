enum Index{
    Good,
    Bad,
    Unknown;
}

public class Solution{

// This is a dynamic programming question, where we use top-down recursive programming
// we are looking at each index to see if it's "Good", "Bad" or "Unknown" where "Good" means it can reach to the last index in the furthese step

    Index[] memo;

    public boolean canJump(int position, int[] nums){
        if (memo[position] != Index.Unknown){
            return memo[position] == Index.Good ? true:false;
        } 

        int furthestJump = Math.min(position + nums[position], nums.length - 1);

        for (int nextPosition = position + 1;
        nextPosition <= furthestJump;
        nextPosition ++){
            if (canJump(nextPosition, nums)){
                memo[position] = Index.Good;
                return true;
            }
        }

        memo[position] = Index.Bad;
        return false;
    } 

    public boolean canJump(int[] nums){
        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i ++){
            memo[i] = Index.Unknown;
        }
        memo[memo.length - 1] = Index.Good;
        return canJump(0, nums);
    }

}

