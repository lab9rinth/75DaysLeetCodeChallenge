class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num : nums)
        {
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }
        List<Integer> ls = new ArrayList<>(hs.keySet());
        ls.sort((a,b)->hs.get(b)-hs.get(a));
        for(int i=0; i<k; i++)
        {
            res[i] = ls.get(i);
        }
        return res;
    }
}