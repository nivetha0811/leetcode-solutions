class Solution {
    static void solve( ArrayList<String> ans,int n,int o, int c,String s){
if(o==n && c==n){
    ans.add(new String(s));
return;
}
if(o<n) solve(ans,n,o+1,c,s+'(');
if(c<o) solve(ans,n,o,c+1,s+')');
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans= new ArrayList<>(); 
        String s="";
        solve(ans,n,0,0,s);
        return ans;
    }
}