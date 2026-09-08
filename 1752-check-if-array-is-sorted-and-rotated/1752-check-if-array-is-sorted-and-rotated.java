class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]>nums[(j+1)%nums.length]){
                cnt++;
            }
        }
        return cnt <= 1 ? true : false;
    }
}