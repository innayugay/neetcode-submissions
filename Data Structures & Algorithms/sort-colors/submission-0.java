class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
    int ones = 0;
    int twos = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            nums[zeros] = 0;
            if (ones > 0) nums[zeros+ones] = 1;
    
            if (twos > 0) nums[zeros+ones+twos] = 2;
            zeros++;
        } else if (nums[i] == 1) {
            nums[zeros+ones] = 1;
            if (twos > 0) nums[zeros+ones+twos] = 2;
            ones ++;

        } else if (nums[i] == 2) {
            nums[zeros+ones+twos] = 2;
            twos ++;
        }
    }
    }
}