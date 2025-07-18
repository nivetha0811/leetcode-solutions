class Solution {
public:
    long long minimumDifference(vector<int>& nums) {
        int n = (int) nums.size() / 3;
        long long ans = 1e18;
        priority_queue<long long> p;
        priority_queue<long long, vector<long long>, greater<long long>> s;
        vector<long long> pv(3 * n, 1e18), sv(3 * n, -1e18);
        long long pre = 0, suf = 0;
        for (int i = 0; i < n; i++) {
            p.push(nums[i]); s.push(nums[3 * n - 1 - i]);
            pre += nums[i], suf += nums[3 * n - 1 - i];
        }
        pv[n - 1] = pre, sv[2 * n] = suf;
        for (int i = n; i < 2 * n; i++) {
            long long q = p.top();
            if (nums[i] < q) {
                p.pop();
                pre += nums[i] - q;
                p.push(nums[i]);
            }
            pv[i] = pre;
        }
        for (int i = 2 * n - 1; i >= n; i--) {
            long long q = s.top();
            if (nums[i] > q) {
                s.pop();
                suf += nums[i] - q;
                s.push(nums[i]);
            }
            sv[i] = suf;
        }
        for (int i = n; i <= 2 * n; i++) ans = min(ans, pv[i - 1] - sv[i]);
        return ans;
    }
};