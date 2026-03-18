class Solution {
    public boolean isMatch(String s, String p) {
        int sptr = 0 , pptr = 0;
        int startidx = -1 , stmpidx = -1;

        while(sptr < s.length()) {

            if(pptr < p.length() && 
               (p.charAt(pptr) == '?' || p.charAt(pptr) == s.charAt(sptr))) {
                pptr++;
                sptr++;
            } 
            else if(pptr < p.length() && p.charAt(pptr) == '*') {
                startidx = pptr;
                stmpidx = sptr;
                pptr++;
            }
            else if(startidx != -1) {
                pptr = startidx + 1;
                stmpidx++;
                sptr = stmpidx;
            } 
            else {
                return false;
            }
        }
        while(pptr < p.length() && p.charAt(pptr) == '*') {
            pptr++;
        }

        return pptr == p.length();
    }
}