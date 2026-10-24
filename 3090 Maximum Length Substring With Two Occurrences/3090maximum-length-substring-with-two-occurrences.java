class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
       int count=0;
        int right=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.containsKey(ch)){
                while( map.get(ch)>2){
                    char leftch=s.charAt(left);
                    map.put(leftch,map.getOrDefault(leftch,0)-1);
                    left++;
                }
                
                   count=Math.max(count,right-left+1);

            }
            right++;
            }
            return count;
            
        }
    }