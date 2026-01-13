class Solution {
    public int searchInsert(int[] nums, int target) {
        int sum=0;
        int d=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==target)
        {
            sum=i;
            d++;
            break;
        }
       }
       if(d==0)
       {
        for(int i=0;i<nums.length;i++)
        {
       
         if(target<nums[i])
            {
                sum=i;
                break;
            }
            else
            {
                sum=nums.length;
            }
            }
           
       }
       return sum;
    }
}