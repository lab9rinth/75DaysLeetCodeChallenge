class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> S = new HashSet<>();
        for(int j=0; j<nums.length; j++)
        {
            if
            (
               S.contains(nums[j])
            )
            return true;
            else 
            S.add(nums[j]);
        }
        return false;
    }
}