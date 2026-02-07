class Solution {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<32;i++){
            sb.append(n%2);
            n/=2;
        }
        String s=String.valueOf(sb);
        int res=0,size=s.length()-1;
        for(char ch:s.toCharArray()){
            int temp=ch-'0';
            res+=temp*((int)Math.pow(2,size));
            size--;
        }
        return res;
    }
}