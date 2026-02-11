class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0, nums,result);
        return result;
    }
    private void backtrack(int start,int[] nums,List<List<Integer>> result){
        if(start==nums.length){
            List<Integer> temp=new ArrayList<Integer>();
            for(int i: nums) temp.add(i);
            result.add(temp);
        }
        Set<Integer> used = new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if (used.contains(nums[i])){
                continue;
            }
            used.add(nums[i]);
            int temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
            backtrack(start+1,nums,result);
            temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
        }
    }
}