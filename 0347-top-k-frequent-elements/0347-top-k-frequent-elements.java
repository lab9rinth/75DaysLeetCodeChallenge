class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            HM.put(nums[i], HM.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> blah = new ArrayList<>(HM.keySet());
        blah.sort((a,b)->HM.get(b)-HM.get(a)); //descending order
        int res[] = new int[k];
        for(int i=0; i<k; i++)
        {
            res[i] = blah.get(i);
        }
        return res;
    }
}