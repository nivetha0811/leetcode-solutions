class Solution {
      public int minimumTotal(List<List<Integer>> triangle) {
              int n = triangle.size();

                      int[][] dp = new int[n][n];

                              // Copy the bottom row
                                      for (int j = 0; j < n; j++) {
                                                  dp[n - 1][j] = triangle.get(n - 1).get(j);
                                                          }

                                                                  // Build DP from bottom to top
                                                                          for (int r = n - 2; r >= 0; r--) {
                                                                                      for (int i = 0; i <= r; i++) {
                                                                                                      dp[r][i] = triangle.get(r).get(i)
                                                                                                                               + Math.min(dp[r + 1][i], dp[r + 1][i + 1]);
                                                                                                                                           }
                                                                                                                                                   }

                                                                                                                                                           return dp[0][0];
                                                                                                                                                               }
                                                                                                                                                               }