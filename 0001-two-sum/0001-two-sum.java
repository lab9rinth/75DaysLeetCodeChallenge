class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> iota = new HashMap<>();
        for(int j=0; j<nums.length; j++)
        {
            int c = target - nums[j];
            if(iota.containsKey(c)){
                return new int[]{iota.get(c), j};
            }
            iota.put(nums[j],j);
        }
        return new int[]{};
    }
}