import java.util.regex.*;

class Solution {
    public boolean isNumber(String s) {
        // String regix = "^[+-]?((\\d+\\.\\d*)|(\\.\\d+)|\\d+)([eE][+-]?\\d+)?$";
        // return Pattern.matches(regix,s);
        boolean eseen = false, digitseen = false, dotseen = false;
        int plmiCount =0 ;
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            // digit
            if(Character.isDigit(c)){
                digitseen = true;
            }
            // plusminus
            else if (c=='-' || c=='+'){
                if (plmiCount==2){
                    return false;
                }
                if (i>0 && (s.charAt(i-1)!='e' && s.charAt(i-1)!='E')){
                    return false;
                }
                if (i == s.length()-1){
                    return false;
                }
                plmiCount++;
            }
            // e/E
            else if (c=='e' || c == 'E'){
                if (eseen || !digitseen || i == s.length()-1){
                    return false;
                }
                eseen = true;
            }
            // dot
            else if (c=='.'){
                if (eseen || dotseen){
                    return false;
                }
                if (i==s.length()-1 && !digitseen){
                    return false;
                }
                dotseen =true;
            }
            else {
                return false;
            }
        }
        return true;
        
    }
}