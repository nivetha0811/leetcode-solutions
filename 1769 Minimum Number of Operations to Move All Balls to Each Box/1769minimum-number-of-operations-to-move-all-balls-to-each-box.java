class Solution {
    public int[] minOperations(String boxes) {
        char arr[] = boxes.toCharArray();
        int ans[] = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            for(int j = 0; j< arr.length; j++){
                if((j != i) && arr[j] =='1'){
                    sum += Math.abs(i - j);
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}