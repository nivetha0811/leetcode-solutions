class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int Max_Sum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum= Math.max(nums[i],currentsum + nums[i]);
            Max_Sum=Math.max(currentsum,Max_Sum);
        }
        return Max_Sum;
    }
}