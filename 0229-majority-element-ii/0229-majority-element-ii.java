class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums==null || nums.length==0) return new ArrayList<>();
        int eone = 0, etwo = 1, cone = 0, ctwo = 0;
        for(int num : nums)
        {
            if(num==eone && cone>0) cone++;
            else if (num==etwo && ctwo>0) ctwo++;
            else if (cone==0){eone=num; cone=1;}
            else if (ctwo==0){etwo=num; ctwo=1;}
            else {cone--; ctwo--;}
        }
        List<Integer> res = new ArrayList<>();
        cone=0; ctwo=0;
        for(int num: nums)
        {
            if(num==eone) cone++;
            else if(num==etwo) ctwo++;
        }
        int n = nums.length;
        if(cone > n/3) res.add(eone);
        if(ctwo > n/3) res.add(etwo);
        return res;
    }
}