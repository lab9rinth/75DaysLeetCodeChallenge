class Solution {
    public void moveZeroes(int[] nums) {
        int x=0, y=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {nums[x]=nums[i];
            x++;}
            else{
            y++;}
        }
        for(int i=nums.length-y; i<nums.length; i++)
        {
            nums[i]=0;
        }
    }
}