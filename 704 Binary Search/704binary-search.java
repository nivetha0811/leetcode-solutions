class Solution {
    public int utility(int a[],int low,int high,int t){
        if(low>high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(a[mid] == t){
            return mid;
        }
        if(t<a[mid]){
            return utility(a,low,mid-1,t);
        }
        if(t>a[mid]){
            return utility(a,mid + 1,high,t);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int result=utility(nums,0,n-1,target);
        return result;
        
    }
}