class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int n=x;
        while(x>0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}