public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0;
        int rs = 0;
        for (int i : nums) {
            rs += i;
        }
        for (int i = 0; i < nums.length; ++i) {
            ls += nums[i];
            rs -= nums[i];
            nums[i] = Math.abs(rs - (ls - nums[i]));
        }
        return nums;
    }
}