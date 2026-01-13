class Solution {
    public int lengthOfLastWord(String s) {
        if (!s.contains(" ")) {
            return s.length();
        }
        String[] sArray = s.split(" ");
        return sArray[(sArray.length)-1].length();
    }
}