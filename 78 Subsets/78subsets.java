class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        helper(nums, new ArrayList<>(), 0);
        
        return result;
    }
    
    private void helper(int[] nums, List<Integer> list, int index) {
        
        
        if (index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
    
      
        list.add(nums[index]);
        helper(nums, list, index + 1);
        
       
        list.remove(list.size() - 1);
        
       
        helper(nums, list, index + 1);
    }
}