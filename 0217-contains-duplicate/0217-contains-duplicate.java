class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x = new HashSet<>();
        for(int j=0; j<nums.length; j++)
        {
            if
            (
               x.contains(nums[j])
            )
            return true;
            else 
            x.add(nums[j]);
        }
        return false;
    }
}