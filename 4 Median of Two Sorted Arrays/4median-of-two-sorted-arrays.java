class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] add = new int[n1+n2];
        int I = 0;

        for(int i=0;i<n1;i++){
            add[I]=nums1[i];
            I++;
        }
        for(int i=0;i<n2;i++){
            add[I] = nums2[i];
            I++;
        }
        Arrays.sort(add);
        int n = n1+n2;
        double median;
        if(n%2==0){
           return median = (add[n/2]+add[(n/2)-1])/2.0;
        }
        else{
            return median = add[n/2];
        }
        
    }
}