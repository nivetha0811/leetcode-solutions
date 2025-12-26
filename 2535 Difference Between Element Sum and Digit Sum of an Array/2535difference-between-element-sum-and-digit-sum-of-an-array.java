 public class Solution {
    public int differenceOfSum(int[] nums) {
        int totalSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            totalSum += num;
 
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;}
        }

        return totalSum - digitSum;}
 }