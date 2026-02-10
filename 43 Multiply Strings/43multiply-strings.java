// Time - O(m * n)
// Space - O(m + n)
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        int[] arr1 = Arrays.stream(num1.split("")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(num2.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = arr1[i] * arr2[j];
                int sum = res[i + j + 1] + mul;
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length && res[i] == 0) i++;
        while (i < res.length) sb.append(res[i++]);

        return sb.toString();
    }
}