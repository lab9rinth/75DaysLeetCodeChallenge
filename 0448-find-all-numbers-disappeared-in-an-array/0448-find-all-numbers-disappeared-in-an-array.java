class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Mark existing numbers by negating the values at their corresponding indices
        for (final int num : nums) {
            final int index = Math.abs(num) - 1;
            // Only negate if positive to avoid issues with already processed duplicates
            if (nums[index] > 0) { 
                nums[index] = -nums[index];
            }
        }

        // Iterate through the modified array to find positive values (unmarked indices)
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                // The index + 1 is the disappeared number
                ans.add(i + 1);
            }
        }
        
        return ans;
    }
}
