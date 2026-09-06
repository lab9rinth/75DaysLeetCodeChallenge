class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int j=0; j<nums.length; j++){
            int c = target - nums[j];
            if(hm.containsKey(c)){
                return new int[]{hm.get(c), j};
            }
            hm.put(nums[j], j);
        }
        return new int[0];
    }
}