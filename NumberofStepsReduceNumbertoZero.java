class Solution{
    public int StepsOfReductions(int num){
        // define a variable to calculate the steps
        int counter = 0;

        while (num > 0){
            if (num % 2 == 0){
                // replace num with the value out of num dividing by 2
                num /= 2;
            } else {
                num --;
            }
            counter ++;
        }
        return counter;
    }
}


// Bitwise Operations

class Solution{
    public int StepsOfReductions(int num){
        int counter = 0;

        while (num > 0){
            // in Bitwise Operations, num: xxxxx0 & bitmask: 000001 
            if (num % 1 == 0){
                // >> means Bitwise shifting right in 1 position
                num >> 1;
            } else {
                num --;
            }
            counter ++;
        }
        return counter ;;
    }
}


// Time Complexity: O(logn) -- 2*logn
// Space Complexity: O(1)

