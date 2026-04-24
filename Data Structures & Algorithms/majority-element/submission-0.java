class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int count = freq.getOrDefault(nums[i], 0) + 1;
            if (count > nums.length / 2) {
                return nums[i];
            }
            freq.put(nums[i], count);
        }

        return 0;
    }
}